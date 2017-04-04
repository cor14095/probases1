import csv
import json
import random
import os
import re
import itertools
import shutil

currentDatabase = ''

def generateExampleCSV():
	with open('example.csv', 'w') as output:
		for i in range(1000000):
			tempRow = str(random.randint(0,30))
			for j in range(10):
				tempRow += ','+str(random.randint(0,30))
			tempRow += '\n'
			output.write(tempRow)

def generateDictionary(tableName):
	columns = getColumns(tableName)
	dictionaries = {}
	for i in range(len(columns)):
		dictionaries[i] = {}
	with open(tableName+'.csv') as tableFile:
		reader = csv.reader(tableFile)
		rowCounter = 0
		for row in reader:
			for i in range(len(columns)):
				if(row[i] in dictionaries[i]):
					tempRowIndexes = dictionaries[i][row[i]]
					tempRowIndexes.append(rowCounter)
					dictionaries[i][row[i]] = tempRowIndexes
				else:
					dictionaries[i][row[i]] = [rowCounter]
			rowCounter += 1
	with open(tableName+'Dictionary.json', 'w') as output:
		json.dump(dictionaries, output)

def getColumns(tableName):
	with open(tableName+'.csv') as tableFile:
		reader = csv.reader(tableFile)
		columns = next(reader)
		# print(columns)
		return columns

def getData(tableName, columns):
	result = []
	with open(tableName+'.csv') as tableFile:
		reader = csv.reader(tableFile)
		for row in reader:
			tempRow = []
			for column in columns:
				tempRow.append(row[column])
			result.append(tempRow)
	return result

def dumbSearch(rowQuery):
	result = []
	with open('example.csv') as tableFile:
		reader = csv.reader(tableFile)
		rowCounter = 0
		for row in reader:
			if row[0] == rowQuery:
				result.append(rowCounter)
			rowCounter += 1
	return result

def showDatabases():
	return (next(os.walk('.'))[1])

def createDatabase(databaseName):
	newDatabaseDirectory = (r'./db/') + databaseName
	if not os.path.exists(newDatabaseDirectory):
		#Create directory
		os.makedirs(newDatabaseDirectory)

		#Create metadata file
		metadataFile = {}
		metadataFile['tables'] = {}
		with open('./db/'+databaseName+'/'+databaseName+'Metadata.json', 'w') as output:
			json.dump(metadataFile, output)

		return ("Database '"+databaseName+"' created succesfully.")
	else:
		return ('Database with name: "'+databaseName+'" already exists.')

def dropDatabase(databaseName):
	databaseDirectory = (r'./db/') + databaseName
	if not os.path.exists(databaseDirectory):
		print("Database with name: "+databaseName+" doesnt exists.")
	else:
		shutil.rmtree(databaseDirectory)
		print("Database "+databaseName+" succesfully deleted.")

def useDatabase(databaseName):
	databaseDirectory = (r'./db/') + databaseName
	if os.path.exists(databaseDirectory):
		global currentDatabase
		currentDatabase = databaseName
	else:
		print('Database with name: "'+databaseName+'" doesnt exists.')

def showTables():
	#Insert info in metadata file
	input = open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
	metadata = json.load(input)
	return metadata['tables'].keys()

NO_KEY = 0
FOREIGN_KEY = 1
PRIMARY_KEY = 2
# tableSchemaExample = {'tableName':'table1', 'columns':[{'columnName':'column1', 'key':1, 'constraintTable':'table2', 'constraintColumn':'column1,'type':'int'},{'columnName':'column2', 'key':1, 'type':'date'}]}
def createTable(tableSchema):
	if not os.path.isfile('./db/'+currentDatabase+'/'+tableSchema['tableName']+'.json'):
		#Check if table contains at least one type of key
		pkSum = 0
		fkSum = 0
		for column in tableSchema['columns']:
			if column['key'] == PRIMARY_KEY:
				#Sum to PK counter
				pkSum += 1
			elif column['key'] == FOREIGN_KEY:
				#Sum to FK counter
				fkSum += 1

				#Check if the constraint target table exists
				if not os.path.isfile(r'./db/'+currentDatabase+'/'+column['constraintTable']+'.json'):
					print("Error, constraint target table: "+column['constraintTable']+" doesnt exists in database: "+currentDatabase)
					return False

		#Table cannot have more than one primary key
		if(pkSum)>1:
			print("Error, table cannot have more than one primary key.")
			return False

		#Table has to have at least one type of key
		if((pkSum+fkSum) < 1):
			print("Error, table needs at least one type of key.")
			return False


		#Create file
		file = open('./db/'+currentDatabase+'/'+tableSchema['tableName']+'.json', 'w')
		file.write('{}')

		#Create hash file
		hashFile = open('./db/'+currentDatabase+'/'+tableSchema['tableName']+'.hash', 'w')
		initialHash = {}
		for column in tableSchema['columns']:
			initialHash[column['columnName']] = {}
		json.dump(initialHash, hashFile)

		#Insert info in metadata file
		input = open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
		metadata = json.load(input)
		tempTables = metadata['tables']
		tempTables[tableSchema['tableName']] = {}
		tempTables[tableSchema['tableName']]['columns'] = tableSchema['columns']
		tempTables[tableSchema['tableName']]['lastIndex'] = -1
		tempTables[tableSchema['tableName']]['deletedRows'] = 0
		metadata['tables'] = tempTables

		#Write info in metadata file
		with open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'w') as output:
			json.dump(metadata, output)

		print('Table succesfully created')
	else:
		print('Table with name: '+tableSchema['tableName']+' already exists.')

def getType(columnName, tableName, metadata):
	columnsInTable = metadata['tables'][tableName]['columns']
	for column in columnsInTable:
		if (column['columnName'] == columnName):
			# print("Returning type: "+column['type']+" for column: "+columnName)
			return column['type']
	return False

def checkTypes(insertInfo, metadata):
	columnsInTable = metadata['tables'][insertInfo['tableName']]['columns']
	for i in range(len(insertInfo['columns'])):
		if(getType(insertInfo['columns'][i], insertInfo['tableName'], metadata) == 'int'):
			if(type(insertInfo['values'][i]) != type(1)):
				print("TYPE ERROR")
				return False

		if(getType(insertInfo['columns'][i], insertInfo['tableName'], metadata) == 'float'):
			if(type(insertInfo['values'][i]) != type(1.0)):
				print("TYPE ERROR")
				return False

		if(getType(insertInfo['columns'][i], insertInfo['tableName'], metadata) == 'date'):
			dateExpresion = re.compile('^\d\d-\d\d-\d\d\d\d$')
			if not dateExpresion.match(insertInfo['values'][i]):
				print("TYPE ERROR")
				return False

		if(getType(insertInfo['columns'][i], insertInfo['tableName'], metadata) == 'string'):
			if(type(insertInfo['values'][i]) != type("a")):
				print("TYPE ERROR")
				return False
	return True

def checkConstraints(insertInfo, metadata, tableHash):
	#Traverse every column in the table
	for column in metadata['tables'][insertInfo['tableName']]['columns']:
		value = insertInfo['values'][insertInfo['columns'].index(column['columnName'])]
		#If column is foreign key then check if it already exists in the respective table
		if column['key'] == FOREIGN_KEY:
			try:
				if value == "NULL":
					#It cannot be NULL
					print("Error, column: "+column['columnName']+" cannot be NULL, as it is a foreign key.")
				else:
					#Check if it exists in the respective table
					#Open table file
					constraintTableFile = open(r'./db/'+currentDatabase+'/'+column['constraintTable']+'.hash', 'r')
					constraintTable = json.load(constraintTableFile)
					#If it isnt
					if not (value in constraintTable[column['constraintColumn']]):
						print("Error, "+str(value)+" in column "+column['columnName']+" doesnt exist in constraint table "+column['constraintTable']+" yet.")
						return False
			except:
				#It has to come in the insertion statement
				print("Error, column: "+column['columnName']+" is required, as it is a foreign key.")
				return False

		#If column is primary key then check if its unique in the respective table
		elif column['key'] == PRIMARY_KEY:
			# print("Value: "+str(value)+" column "+column['columnName'])
			if str(value) in tableHash[column['columnName']]:
				print("Error, primary key "+str(value)+" already exists in column: "+column['columnName'])
				return False

	#If all the columns are good then return True
	return True

# insertInfoExample = {'tableName': 'table1', 'columns':['id','nombre','edad'], 'values':[1, 'Perry', 20]}
def insertRecord(insertInfo):
	#Perform parity check
	if(len(insertInfo['columns']) != len(insertInfo['values'])):
		print 'Error, values quantity doesnt match columns quantity'
		return False

	#Open metadata file
	metadataFile = open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
	metadata = json.load(metadataFile)

	#Check if table exists
	if insertInfo['tableName'] not in metadata['tables']:
		print("Error, table: "+insertInfo['tableName']+" doesnt exists in database: "+currentDatabase)
		return False

	#Perform type checks
	if(checkTypes(insertInfo, metadata) != True):
		print 'Error, types dont match with the table types.'
		return False

	#Open hash file
	tableHashFile = open('./db/'+currentDatabase+'/'+insertInfo['tableName']+'.hash', 'r')
	tableHash = json.load(tableHashFile)

	#Perform constraint check
	if(checkConstraints(insertInfo, metadata, tableHash) != True):
		return False


	#Construct key-value pair to insert to table json file and store index in hash
	resultingCSV = ""
	for column in metadata['tables'][insertInfo['tableName']]['columns']:
		try:
			#Construct CSV
			tempIndex = insertInfo['columns'].index(column['columnName'])
			resultingCSV += str(insertInfo['values'][tempIndex]) + ","

			#Insert to Hash
			if str(insertInfo['values'][tempIndex]) in tableHash[column['columnName']]:
				tempArray = tableHash[column['columnName']][str(insertInfo['values'][tempIndex])]
				tempArray.append(metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1)
				tableHash[column['columnName']][str(insertInfo['values'][tempIndex])] = tempArray
			else:
				tableHash[column['columnName']][str(insertInfo['values'][tempIndex])] = [metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1]
		except:
			# print('Except triggered')
			resultingCSV += "NULL" + ","

	#Write hash back to file
	tableHashFile = open('./db/'+currentDatabase+'/'+insertInfo['tableName']+'.hash', 'w')
	json.dump(tableHash, tableHashFile)

	resultingCSV = resultingCSV[:-1]

	

	#Open table file
	tableFile = open('./db/'+currentDatabase+'/'+insertInfo['tableName']+'.json', 'r')

	## VERSION LOADING JSON TO MEMORY ####################################################################################################
	# #Load JSON
	# tableJSON = json.load(tableFile)

	# #Add row
	# tableJSON[metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1] = resultingCSV

	# #Write table file
	# json.dump(tableJSON, open('./db/'+currentDatabase+'/'+insertInfo['tableName']+'.json', 'w'))
	######################################################################################################################################






	## VERSION ALTERING FILE DIRECTLY ####################################################################################################
	currentJSON = tableFile.readlines()[0]
	if(currentJSON == "{}"):
		newJSON = currentJSON[:-1] + '"' + str(metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1) + '":"' + resultingCSV + '"}'
	else:
		newJSON = currentJSON[:-1] + ',"' + str(metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1) + '":"' + resultingCSV + '"}'
	tableFile = open('./db/'+currentDatabase+'/'+insertInfo['tableName']+'.json', 'w')
	tableFile.write(newJSON)
	######################################################################################################################################
	
	#Update index in metadata
	# print(metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1)
	metadata['tables'][insertInfo['tableName']]['lastIndex'] = metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1

	#Write metadata
	json.dump(metadata, open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'w'))

	# print('Insert successful.')
	return True

def deleteIndexes(indexesToDelete, inputJson):
	for indexToDelete in indexesToDelete:
		print("\nDeleting index: "+str(indexToDelete))
		firstRegex = r'{"' + str(indexToDelete) + r'":"[^"]*",'
		inputJson = re.sub(firstRegex, '{', inputJson)

		middleRegex = r',"' + str(indexToDelete) + r'":"[^"]*",'
		inputJson = re.sub(middleRegex, ',', inputJson)

		lastRegex = r',"' + str(indexToDelete) + r'":"[^"]*"}'
		inputJson = re.sub(lastRegex, '}', inputJson)

		onlyRegex = r'{"' + str(indexToDelete) + r'":"[^"]*"}'
		inputJson = re.sub(onlyRegex, '{}', inputJson)

	return inputJson

# deleteInfoExample = {'tableName':'table1', 'indexes':[1,3]}
def deleteRows(deleteInfo):
	tableFile = open('./db/'+currentDatabase+'/'+deleteInfo['tableName']+'.json', 'r')
	jsonFile = tableFile.readlines()[0]

	newJson = deleteIndexes(deleteInfo['indexes'], jsonFile)

	tableFileOutput = open('./db/'+currentDatabase+'/'+deleteInfo['tableName']+'.json', 'w')
	tableFileOutput.write(newJson)

	return True

# Example call: cartesianProduct(['table1', 'table2', 'table3'])
def cartesianProduct(tables):
	#Open metadata file
	metadataFile = open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
	metadata = json.load(metadataFile)


	#Check existence of all tables
	for table in tables:
		if not (table in metadata['tables']):
			print("Table: "+table+" doesnt exist in database: "+currentDatabase)
			return False

	#Load all tables involved
	data = []
	for table in tables:
		#Open table file
		tableFile = open('./db/'+currentDatabase+'/'+table+'.json', 'r')
		jsonFile = json.load(tableFile)
		tempData = []
		for key, value in jsonFile.items():
			tempData.append(value)
		data.append(tempData)

	#Generate combinations
	cartesianProductResult = itertools.product(*data)

	#Clean
	cartesianProductResult = map((lambda x : (','.join(map(str,x)))), cartesianProductResult)
	cartesianProductResult = map((lambda x : x.split(",")), cartesianProductResult)

	# print(cartesianProductResult)
	# for i in cartesianProductResult:
	# 	print(i)

	#Generate metadata from cartesianProductResult
	columns = []
	for table in tables:
		tempColumns = metadata['tables'][table]['columns']
		for column in tempColumns:
			column['originTable'] = table
		columns = columns + tempColumns

	metadataResult = {}
	metadataResult['columns'] = columns

	return metadataResult, cartesianProductResult

def filterOverCartesianProduct(tableSchema, tableData, operation, firstWhere, secondWhere):
	# print("Called with operation: "+str(operation))
	if(operation == "NULL"):
		resultData = []
		#Check ambiguity
		indexesFound = 0
		for i in range(len(tableSchema['columns'])):
			# print("tableSchema:\n")
			# print(tableSchema['columns'][i]['columnName'])
			# print("firstWhere:\n")
			# print(firstWhere['constraintColumn'])
			if tableSchema['columns'][i]['columnName'] == firstWhere['constraintColumn']:
				indexesFound = indexesFound + 1
				indexToCompare = i
			# print("CHECKPOINT")

		if(indexesFound == 0):
			print("Error, column: "+firstWhere['constraintColumn']+" doesnt exists in the resulting cartesian product table.")
			return False
		elif(indexesFound > 1):
			print("Error, reference to column: "+firstWhere['constraintColumn']+" is ambiguous in the resulting cartesian product table.")
			return False

		#Check type compatibility
		desiredType = tableSchema['columns'][indexToCompare]['type']
		compareTo = firstWhere['compareTo']

		try:
			if((desiredType == 'string') or (desiredType == 'date')):
				compareTo = str(compareTo)
			elif(desiredType == 'int'):
				compareTo = int(compareTo)
			elif(desiredType == 'float'):
				compareTo = float(compareTo)
		except:
			print("Error, "+str(compareTo)+" couldnt be casted to the type of: "+firstWhere['constraintColumn']+" ("+desiredType+")")
			return False

		# compareTo = str(compareTo)

		#Perform filter
		if(firstWhere['operation'] == '='):
			for row in tableData:
				# print("Checking if "+str(row[indexToCompare])+"("+str(type(row[indexToCompare]))+")="+str(compareTo)+"("+str(type(compareTo))+")")
				compareRow = row[indexToCompare]
				if(desiredType == 'int'):
					compareRow = int(compareRow)
				elif(desiredType == 'float'):
					compareRow = float(compareRow)
				if compareRow == compareTo:
					resultData.append(row)
		elif(firstWhere['operation'] == '<'):
			for row in tableData:
				compareRow = row[indexToCompare]
				if(desiredType == 'int'):
					compareRow = int(compareRow)
				elif(desiredType == 'float'):
					compareRow = float(compareRow)
				if compareRow < compareTo:
					resultData.append(row)
		elif(firstWhere['operation'] == '<='):
			for row in tableData:
				compareRow = row[indexToCompare]
				if(desiredType == 'int'):
					compareRow = int(compareRow)
				elif(desiredType == 'float'):
					compareRow = float(compareRow)
				if compareRow <= compareTo:
					resultData.append(row)
		elif(firstWhere['operation'] == '>'):
			for row in tableData:
				compareRow = row[indexToCompare]
				if(desiredType == 'int'):
					compareRow = int(compareRow)
				elif(desiredType == 'float'):
					compareRow = float(compareRow)
				if compareRow > compareTo:
					resultData.append(row)
		elif(firstWhere['operation'] == '>='):
			for row in tableData:
				compareRow = row[indexToCompare]
				if(desiredType == 'int'):
					compareRow = int(compareRow)
				elif(desiredType == 'float'):
					compareRow = float(compareRow)
				if compareRow >= compareTo:
					resultData.append(row)
		elif(firstWhere['operation'] == 'not'):
			for row in tableData:
				compareRow = row[indexToCompare]
				if(desiredType == 'int'):
					compareRow = int(compareRow)
				elif(desiredType == 'float'):
					compareRow = float(compareRow)
				if compareRow != compareTo:
					resultData.append(row)
		
		return resultData

	elif(operation == "AND"):
		#Filter childs
		firstWhereResults = filterOverCartesianProduct(tableSchema, tableData, firstWhere['operation'], firstWhere['firstWhere'], firstWhere['secondWhere'])
		secondWhereResults = filterOverCartesianProduct(tableSchema, tableData, secondWhere['operation'], secondWhere['firstWhere'], secondWhere['secondWhere'])

		#AND results of childs
		resultData = []

		for result in firstWhereResults:
			if result in secondWhereResults:
				resultData.append(result)

		return resultData

	elif(operation == "OR"):
		#Filter childs
		firstWhereResults = filterOverCartesianProduct(tableSchema, tableData, firstWhere['operation'], firstWhere['firstWhere'], firstWhere['secondWhere'])
		secondWhereResults = filterOverCartesianProduct(tableSchema, tableData, secondWhere['operation'], secondWhere['firstWhere'], secondWhere['secondWhere'])

		#OR results of childs
		for result in secondWhereResults:
			if result not in firstWhereResults:
				firstWhereResults.append(result)

		return firstWhereResults

def filterOverSingleTable(tableName, operation, firstWhere, secondWhere):
	if(operation == "NULL"):
		#Check type compatibility
		metadataFile = open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
		metadata = json.load(metadataFile)

		for column in metadata['tables'][tableName]['columns']:
			print("Comparing: "+column['columnName']+" with "+firstWhere['constraintColumn'])
			if column['columnName'] == firstWhere['constraintColumn']:
				desiredType = column['type']

		compareTo = firstWhere['compareTo']

		try:
			if((desiredType == 'string') or (desiredType == 'date')):
				compareTo = str(compareTo)
			elif(desiredType == 'int'):
				compareTo = int(compareTo)
			elif(desiredType == 'float'):
				compareTo = float(compareTo)
			# print("Cast complete")
		except:
			print("Error, "+str(compareTo)+" couldnt be casted to the type of: "+firstWhere['constraintColumn']+" ("+desiredType+")")
			return False
		
		#Open table hash file
		tableHashFile = open(r'./db/'+currentDatabase+'/'+tableName+'.hash', 'r')
		tableHash = json.load(tableHashFile)

		#Get hash for specific column
		columnHash = tableHash[firstWhere['constraintColumn']]

		#Get keys of column
		columnKeys = columnHash.keys()
		# print("Column keys PRECAST: ")
		# print(columnKeys)

		#Cast keys to respective type
		if(desiredType == 'int'):
			columnKeys = map(int, columnKeys)
		elif(desiredType == 'float'):
			columnKeys = map(float, columnKeys)

		# print("Column keys POSTCAST: ")
		# print(columnKeys)

		# print("compareTo: "+str(compareTo)+str(type(compareTo)))

		#Get matching keys
		matchingKeys = []
		if(firstWhere['operation'] == '='):
			for key in columnKeys:
				if key == compareTo:
					matchingKeys.append(key)
		elif(firstWhere['operation'] == '<'):
			for key in columnKeys:
				if key < compareTo:
					matchingKeys.append(key)
		elif(firstWhere['operation'] == '<='):
			for key in columnKeys:
				if key <= compareTo:
					matchingKeys.append(key)
		elif(firstWhere['operation'] == '>'):
			for key in columnKeys:
				if key > compareTo:
					matchingKeys.append(key)
		elif(firstWhere['operation'] == '>='):
			for key in columnKeys:
				if key >= compareTo:
					matchingKeys.append(key)
		elif(firstWhere['operation'] == 'not'):
			for key in columnKeys:
				if key != compareTo:
					matchingKeys.append(key)

		#Get row indexes
		rowIndexes = []
		for key in matchingKeys:
			rowIndexes = list(set(rowIndexes) | set(columnHash[str(key)]))
		# print("Row indexes")
		# print(rowIndexes)

		#Open table data file
		tableFile = open(r'./db/'+currentDatabase+'/'+tableName+'.json', 'r')
		table = json.load(tableFile)

		#Generate resulting set of rows
		resultData = []
		for index in rowIndexes:
			# print(table[str(key)])
			resultData.append(table[str(index)])
		# print(resultData)
		resultData = map((lambda x : x.split(",")), resultData)
		# print(resultData)
		return resultData

	elif(operation == "AND"):
		#Filter childs
		firstWhereResults = filterOverSingleTable(tableName, firstWhere['operation'], firstWhere['firstWhere'], firstWhere['secondWhere'])
		secondWhereResults = filterOverSingleTable(tableName, secondWhere['operation'], secondWhere['firstWhere'], secondWhere['secondWhere'])

		#AND results of childs
		resultData = []

		for result in firstWhereResults:
			if result in secondWhereResults:
				resultData.append(result)

		return resultData

	elif(operation == "OR"):
		#Filter childs
		firstWhereResults = filterOverSingleTable(tableName, firstWhere['operation'], firstWhere['firstWhere'], firstWhere['secondWhere'])
		secondWhereResults = filterOverSingleTable(tableName, secondWhere['operation'], secondWhere['firstWhere'], secondWhere['secondWhere'])

		#OR results of childs
		for result in secondWhereResults:
			if result not in firstWhereResults:
				firstWhereResults.append(result)

		return firstWhereResults

def filterOverSingleTableWithIndexes(tableName, operation, firstWhere, secondWhere):
	if(operation == "NULL"):
		#Check type compatibility
		metadataFile = open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
		metadata = json.load(metadataFile)

		for column in metadata['tables'][tableName]['columns']:
			# print("Comparing: "+column['columnName']+" with "+firstWhere['constraintColumn'])
			if column['columnName'] == firstWhere['constraintColumn']:
				desiredType = column['type']

		compareTo = firstWhere['compareTo']

		try:
			if((desiredType == 'string') or (desiredType == 'date')):
				compareTo = str(compareTo)
			elif(desiredType == 'int'):
				compareTo = int(compareTo)
			elif(desiredType == 'float'):
				compareTo = float(compareTo)
			# print("Cast complete")
		except:
			print("Error, "+str(compareTo)+" couldnt be casted to the type of: "+firstWhere['constraintColumn']+" ("+desiredType+")")
			return False
		
		#Open table hash file
		tableHashFile = open(r'./db/'+currentDatabase+'/'+tableName+'.hash', 'r')
		tableHash = json.load(tableHashFile)

		#Get hash for specific column
		columnHash = tableHash[firstWhere['constraintColumn']]

		#Get keys of column
		columnKeys = columnHash.keys()
		# print("Column keys PRECAST: ")
		# print(columnKeys)

		#Cast keys to respective type
		if(desiredType == 'int'):
			columnKeys = map(int, columnKeys)
		elif(desiredType == 'float'):
			columnKeys = map(float, columnKeys)

		# print("Column keys POSTCAST: ")
		# print(columnKeys)

		# print("compareTo: "+str(compareTo)+str(type(compareTo)))

		#Get matching keys
		matchingKeys = []
		if(firstWhere['operation'] == '='):
			for key in columnKeys:
				if key == compareTo:
					matchingKeys.append(key)
		elif(firstWhere['operation'] == '<'):
			for key in columnKeys:
				if key < compareTo:
					matchingKeys.append(key)
		elif(firstWhere['operation'] == '<='):
			for key in columnKeys:
				if key <= compareTo:
					matchingKeys.append(key)
		elif(firstWhere['operation'] == '>'):
			for key in columnKeys:
				if key > compareTo:
					matchingKeys.append(key)
		elif(firstWhere['operation'] == '>='):
			for key in columnKeys:
				if key >= compareTo:
					matchingKeys.append(key)
		elif(firstWhere['operation'] == 'not'):
			for key in columnKeys:
				if key != compareTo:
					matchingKeys.append(key)

		#Get row indexes
		rowIndexes = []
		for key in matchingKeys:
			rowIndexes = list(set(rowIndexes) | set(columnHash[str(key)]))
		# print("Row indexes")
		# print(rowIndexes)

		#Open table data file
		tableFile = open(r'./db/'+currentDatabase+'/'+tableName+'.json', 'r')
		table = json.load(tableFile)

		#Generate resulting set of rows
		resultData = []
		for index in rowIndexes:
			# print(table[str(key)])
			resultData.append(table[str(index)])
		# print(resultData)
		resultData = map((lambda x : x.split(",")), resultData)
		# print(resultData)

		#Return indexes and data
		return rowIndexes, resultData

	elif(operation == "AND"):
		#Filter childs
		firstWhereIndexes, firstWhereResults = filterOverSingleTableWithIndexes(tableName, firstWhere['operation'], firstWhere['firstWhere'], firstWhere['secondWhere'])
		secondWhereIndexes, secondWhereResults = filterOverSingleTableWithIndexes(tableName, secondWhere['operation'], secondWhere['firstWhere'], secondWhere['secondWhere'])

		#AND indexes of childs
		rowIndexes = []
		for index in firstWhereIndexes:
			if index in secondWhereIndexes:
				rowIndexes.append(index)

		#AND results of childs
		resultData = []
		for result in firstWhereResults:
			if result in secondWhereResults:
				resultData.append(result)

		return rowIndexes, resultData

	elif(operation == "OR"):
		#Filter childs
		firstWhereIndexes, firstWhereResults = filterOverSingleTableWithIndexes(tableName, firstWhere['operation'], firstWhere['firstWhere'], firstWhere['secondWhere'])
		secondWhereIndexes, secondWhereResults = filterOverSingleTableWithIndexes(tableName, secondWhere['operation'], secondWhere['firstWhere'], secondWhere['secondWhere'])

		#OR indexes of childs
		for index in secondWhereIndexes:
			if index not in firstWhereIndexes:
				firstWhereIndexes.append(index)

		#OR results of childs
		for result in secondWhereResults:
			if result not in firstWhereResults:
				firstWhereResults.append(result)

		return firstWhereIndexes, firstWhereResults

def select(selectInfo):
	#Check if cartesian product is needed
	if(len(selectInfo['from']) > 1):
		#Perform FROM, cartesian product
		cartesianProductSchema, cartesianProductResult = cartesianProduct(selectInfo['from'])

		#Perform WHERE, row filtering
		filterResult = filterOverCartesianProduct(cartesianProductSchema, cartesianProductResult, selectInfo['where']['operation'], selectInfo['where']['firstWhere'], selectInfo['where']['secondWhere'])

		#Perform SELECT, column selection
		selectedColumns = []
		# print(cartesianProductSchema)
		for columnName in selectInfo['select']:
			for i in range(len(cartesianProductSchema['columns'])):
				if cartesianProductSchema['columns'][i]['columnName'] == columnName:
					selectedColumns.append(i)

		# print(selectedColumns)

		finalResult = [selectInfo['select']]
		for row in filterResult:
			tempRow = []
			for column in selectedColumns:
				tempRow.append(row[column])
			finalResult.append(tempRow)

		return finalResult
	else:
		#Continue select using the hash
		#Perform WHERE, row filtering
		filterResult = filterOverSingleTable(selectInfo['from'][0], selectInfo['where']['operation'], selectInfo['where']['firstWhere'], selectInfo['where']['secondWhere'])

		#Perform SELECT, column selection
		#Open metadata file
		metadataFile = open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
		metadata = json.load(metadataFile)

		selectedColumns = []
		for columnName in selectInfo['select']:
			for i in range(len(metadata['tables'][selectInfo['from'][0]]['columns'])):
				if metadata['tables'][selectInfo['from'][0]]['columns'][i]['columnName'] == columnName:
					selectedColumns.append(i)


		finalResult = [selectInfo['select']]
		for row in filterResult:
			tempRow = []
			for column in selectedColumns:
				tempRow.append(row[column])
			finalResult.append(tempRow)

		return finalResult

'''
deleteInfoExample = {
	'from':['table1'],
	'where':{
		'operation':'OR',
		'firstWhere':{
			'operation':'NULL',
			'firstWhere':{
				'operation':'=',
				'constraintColumn':'column2',
				'compareTo':666
			},
			'secondWhere':{}
		},
		'secondWhere':{
			'operation':'AND',
			'firstWhere':{
				'operation':'NULL',
				'firstWhere':{
					'operation':'>',
					'constraintColumn':'column2',
					'compareTo':10
				},
				'secondWhere':{}
			},
			'secondWhere':{
				'operation':'NULL',
				'firstWhere':{
					'operation':'<',
					'constraintColumn':'column2',
					'compareTo':20
				},
				'secondWhere':{}
			}
		}
	}
}
'''

def delete(deleteInfo):
	#Open metadata file
	metadataFile = open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
	metadata = json.load(metadataFile)

	#Check references to this table
	referencedValues = {}

	#Collect references to this table
	for tableName, tableData in metadata['tables'].items():
		for column in tableData['columns']:
			if column['key'] == FOREIGN_KEY:
				if column['constraintTable'] == deleteInfo['from'][0]:
					#Load table hash to retrieve values in column
					tableHashFile = open('./db/'+currentDatabase+'/'+tableName+'.hash', 'r')
					tableHash = json.load(tableHashFile)
					referencedValues[column['constraintColumn']] = tableHash[column['columnName']].keys()

	# print(referencedValues)

	#Perform WHERE, generate indexes to be deleted in table
	indexesToDelete, rowsToDelete = filterOverSingleTableWithIndexes(deleteInfo['from'][0], deleteInfo['where']['operation'], deleteInfo['where']['firstWhere'], deleteInfo['where']['secondWhere'])

	# print(rowsToDelete)

	#Check if we're attempting to delete a referenced row
	for columnName, values in referencedValues.items():
		for i in range(len(metadata['tables'][deleteInfo['from'][0]]['columns'])):
			if metadata['tables'][deleteInfo['from'][0]]['columns'][i]['columnName'] == columnName:
				currentIndex = i

		for row in rowsToDelete:
			if row[currentIndex] in values:
				print("Error, attempting to delete rows were values are being referenced to in another table.")
				return False

	#If its all clear proceed to delete rows


	#Delete from table data
	#Open table file
	tableFile = open(r'./db/'+currentDatabase+'/'+deleteInfo['from'][0]+'.json', 'r')
	table = json.load(tableFile)
	for indexToDelete in indexesToDelete:
		table.pop(str(indexToDelete))

	#Write back file data
	tableFile = open(r'./db/'+currentDatabase+'/'+deleteInfo['from'][0]+'.json', 'w')
	json.dump(table, tableFile)

	#Delete from hash
	#Open table hash file
	tableHashFile = open(r'./db/'+currentDatabase+'/'+deleteInfo['from'][0]+'.hash', 'r')
	tableHash = json.load(tableHashFile)
	for column, columnHash in tableHash.items():
		for value, indexes in columnHash.items():
			newIndexes = []
			for index in indexes:
				if index not in indexesToDelete:
					newIndexes.append(index)
			if(len(newIndexes) == 0):
				tableHash[column].pop(value)
			else:
				tableHash[column][value] = newIndexes

	#Write back hash info
	tableHashFile = open(r'./db/'+currentDatabase+'/'+deleteInfo['from'][0]+'.hash', 'w')
	json.dump(tableHash, tableHashFile)
	
	print("Succesfully deleted "+str(len(indexesToDelete))+" rows.")
	
'''
updateInfoExample = {
	'tableName':'table1',
	'columnsToUpdate':{
		'column1':'newValue1',
		'column2':'newValue2'
	},
	'where':{
		'operation':'OR',
		'firstWhere':{
			'operation':'NULL',
			'firstWhere':{
				'operation':'>',
				'constraintColumn':'column2',
				'compareTo':20
			},
			'secondWhere':{}
		},
		'secondWhere':{
			'operation':'NULL',
			'firstWhere':{
				'operation':'<',
				'constraintColumn':'column2',
				'compareTo':10
			},
			'secondWhere':{}
		}
	}
}
'''
def update(updateInfo):
	#Open metadata file
	metadataFile = open('./db/'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
	metadata = json.load(metadataFile)

	#Check if newValue can be casted to the type of the column it wants to set
	for columnToUpdate, newValue in updateInfo['columnsToUpdate'].items():
		for column in  metadata['tables'][updateInfo['tableName']]['columns']:
			if column['columnName'] == columnToUpdate:
				desiredType = column['type']
		try:
			if(desiredType == 'int'):
				int(newValue)
			elif(desiredType == 'float'):
				float(newValue)
			elif(desiredType == 'date'):
				dateExpresion = re.compile('^\d\d-\d\d-\d\d\d\d$')
				if not dateExpresion.match(newValue):
					print("Type Error. Couldnt cast "+str(newValue)+" to "+desiredType)
					return False
		except:
			print("Type error. Couldnt cast "+str(newValue)+" to "+desiredType)
			return False


	#If table to update contains a foreign key, check if the newValue is already a primary key in the constraint table
	for column in metadata['tables'][updateInfo['tableName']]['columns']:
		if column['key'] == FOREIGN_KEY:
			if column['columnName'] in updateInfo['columnsToUpdate']:
				#Open constraint table hash
				constraintTableFile = open(r'./db/'+currentDatabase+'/'+column['constraintTable']+'.hash', 'r')
				constraintTable = json.load(constraintTableFile)
				if updateInfo['columnsToUpdate'][column['columnName']] not in constraintTable[column['constraintColumn']]:
					print("Error, trying to update "+column['columnName']+" to "+updateInfo['columnsToUpdate'][column['columnName']]+" which doesnt exists yet as a primary key in constraint column "+column['constraintColumn']+" in constraint table "+column['constraintTable'])
					return False

	#Check references to this table
	referencedValues = {}

	#Collect references to this table
	for tableName, tableData in metadata['tables'].items():
		for column in tableData['columns']:
			if column['key'] == FOREIGN_KEY:
				if column['constraintTable'] == updateInfo['tableName']:
					#Load table hash to retrieve values in column
					tableHashFile = open('./db/'+currentDatabase+'/'+tableName+'.hash', 'r')
					tableHash = json.load(tableHashFile)
					referencedValues[column['constraintColumn']] = tableHash[column['columnName']].keys()

	#Perform WHERE, generate indexes to be updated in table
	indexesToUpdate, rowsToUpdate = filterOverSingleTableWithIndexes(updateInfo['tableName'], updateInfo['where']['operation'], updateInfo['where']['firstWhere'], updateInfo['where']['secondWhere'])

	#Check if we're attempting to update a referenced value in a row
	for columnName, values in referencedValues.items():
		if columnName in updateInfo['columnsToUpdate']:
			print("Error, trying to update rows were values are being referenced to in another column")
			return False

	#If its all clear, proceed to update rows

	#Open table file
	tableFile = open(r'./db/'+currentDatabase+'/'+updateInfo['tableName']+'.json', 'r')
	table = json.load(tableFile)

	#Open table hash file
	tableHashFile = open(r'./db/'+currentDatabase+'/'+updateInfo['tableName']+'.hash', 'r')
	tableHash = json.load(tableHashFile)
	# print("Indexes to update:")
	# print(indexesToUpdate)
	for indexToUpdate in indexesToUpdate:
		rowSplitted = table[str(indexToUpdate)].split(",")
		for columnToUpdate, newValue in updateInfo['columnsToUpdate'].items():
			for i in range(len(metadata['tables'][updateInfo['tableName']]['columns'])):
				if metadata['tables'][updateInfo['tableName']]['columns'][i]['columnName'] == columnToUpdate:
					#Update info in hash
					# print("Trying to retrieve hash from column: "+columnToUpdate+", value: "+str(rowSplitted[i]))
					tempArray = tableHash[columnToUpdate][str(rowSplitted[i])]
					tempArray.remove(indexToUpdate)
					tableHash[columnToUpdate][str(rowSplitted[i])] = tempArray
					if (tableHash[columnToUpdate][str(rowSplitted[i])] == None) or len(tableHash[columnToUpdate][str(rowSplitted[i])]) == 0:
						# print("Removed all, proceeding to pop key "+str(rowSplitted[i]))
						tableHash[columnToUpdate].pop(str(rowSplitted[i]))

					if str(newValue) in tableHash[columnToUpdate]:
						# print("IT IS:")
						# print(tableHash[columnToUpdate])
						# print(tableHash[columnToUpdate][str(newValue)])
						# print("Trying to add "+str(indexToUpdate)+" to "+str(tableHash[columnToUpdate][str(newValue)])+" attached to key "+str(newValue))
						tempArray = tableHash[columnToUpdate][str(newValue)]
						# print("Temp array:")
						# print(str(tempArray))
						tempArray.append(indexToUpdate)
						tableHash[columnToUpdate][str(newValue)] = tempArray
						# print("Resulting append:")
						# print(str(tableHash[columnToUpdate][str(newValue)]))
					else:
						# print("ITS NOT:")
						# print(tableHash[columnToUpdate])
						# print("Trying to add "+str(indexToUpdate)+" to key "+str(newValue))
						tableHash[columnToUpdate][str(newValue)] = [indexToUpdate]

					#Update value in data
					rowSplitted[i] = newValue
		rowSplitted = map(str, rowSplitted)
		rowJoined = ','.join(rowSplitted)
		table[indexToUpdate] = rowJoined

	#Write back table file
	tableFile = open(r'./db/'+currentDatabase+'/'+updateInfo['tableName']+'.json', 'w')
	json.dump(table, tableFile)

	#Write back hash file
	tableHashFile = open(r'./db/'+currentDatabase+'/'+updateInfo['tableName']+'.hash', 'w')
	json.dump(tableHash, tableHashFile)

	print("Succesfully updated "+str(len(indexesToUpdate))+" rows.")





















# Testing area

# dropDatabase('database1')

# createDatabase('database1')

# useDatabase('database1')

# print(showTables())

# tableSchemaExample = {'tableName':'table2', 'columns':[{'columnName':'column3', 'key':2, 'type':'date'},{'columnName':'column4', 'key':0, 'type':'string'}]}
# createTable(tableSchemaExample)

# tableSchemaExample = {'tableName':'table1', 'columns':[{'columnName':'column1', 'key':1, 'constraintTable':'table2', 'constraintColumn':'column3', 'type':'date'},{'columnName':'column2', 'key':0, 'type':'int'}]}
# createTable(tableSchemaExample)

# print("Inserting into table 2")
# insertRecord({'tableName': 'table2', 'columns':['column3', 'column4'], 'values':['12-12-1212', 'Bryan Chan']})

# print("Inserting into table 2")
# insertRecord({'tableName': 'table2', 'columns':['column3', 'column4'], 'values':['24-24-2424', 'Alejandro Cortes']})

# print("Inserting into table 1")
# insertRecord({'tableName': 'table1', 'columns':['column2', 'column1'], 'values':[12, '12-12-1212']})
# print("Inserting into table 1")
# insertRecord({'tableName': 'table1', 'columns':['column2', 'column1'], 'values':[15, '12-12-1212']})
# print("Inserting into table 1")
# insertRecord({'tableName': 'table1', 'columns':['column2', 'column1'], 'values':[19, '12-12-1212']})

# print("Inserting into table 1")
# insertRecord({'tableName': 'table1', 'columns':['column2', 'column1'], 'values':[24, '12-12-1212']})

# print("Inserting into table 1")
# insertRecord({'tableName': 'table1', 'columns':['column2', 'column1'], 'values':[36, '12-12-1212']})

# for i in range(1000):
# 	print("Inserting into table 1: "+str(i))
# 	insertRecord({'tableName': 'table1', 'columns':['column2', 'column1'], 'values':[random.randint(0,50), '12-12-1212']})


'''
selectInfo = {
	'select':['column2','column4'],
	'from':['table1','table2'],
	'where':{
		'operation':'OR',
		'firstWhere':{
			'operation':'NULL',
			'firstWhere':{
				'operation':'=',
				'constraintColumn':'column4',
				'compareTo':'Bryan Chan'
			},
			'secondWhere':{}
		},
		'secondWhere':{
			'operation':'AND',
			'firstWhere':{
				'operation':'NULL',
				'firstWhere':{
					'operation':'=',
					'constraintColumn':'column4',
					'compareTo':'Alejandro Cortes'
				},
				'secondWhere':{}
			},
			'secondWhere':{
				'operation':'NULL',
				'firstWhere':{
					'operation':'<',
					'constraintColumn':'column2',
					'compareTo':100
				},
				'secondWhere':{}
			}
		}
	}
}

print(select(selectInfo))
'''

selectInfo = {
	'select':['column2','column1'],
	'from':['table1'],
	'where':{
		'operation':'OR',
		'firstWhere':{
			'operation':'NULL',
			'firstWhere':{
				'operation':'=',
				'constraintColumn':'column2',
				'compareTo':50
			},
			'secondWhere':{}
		},
		'secondWhere':{
			'operation':'AND',
			'firstWhere':{
				'operation':'NULL',
				'firstWhere':{
					'operation':'>',
					'constraintColumn':'column2',
					'compareTo':10
				},
				'secondWhere':{}
			},
			'secondWhere':{
				'operation':'NULL',
				'firstWhere':{
					'operation':'<',
					'constraintColumn':'column2',
					'compareTo':20
				},
				'secondWhere':{}
			}
		}
	}
}

# print(select(selectInfo))


deleteInfoExample = {
	'from':['table1'],
	'where':{
		'operation':'AND',
		'firstWhere':{
			'operation':'NULL',
			'firstWhere':{
				'operation':'=',
				'constraintColumn':'column2',
				'compareTo':666
			},
			'secondWhere':{}
		},
		'secondWhere':{
			'operation':'NULL',
			'firstWhere':{
				'operation':'=',
				'constraintColumn':'column2',
				'compareTo':666
			},
			'secondWhere':{}
		}
	}
}

# delete(deleteInfoExample)


updateInfoExample = {
	'tableName':'table1',
	'columnsToUpdate':{
		'column1':'24-24-2424',
		'column2':666
	},
	'where':{
		'operation':'AND',
		'firstWhere':{
			'operation':'NULL',
			'firstWhere':{
				'operation':'=',
				'constraintColumn':'column2',
				'compareTo':100
			},
			'secondWhere':{}
		},
		'secondWhere':{
			'operation':'NULL',
			'firstWhere':{
				'operation':'=',
				'constraintColumn':'column2',
				'compareTo':100
			},
			'secondWhere':{}
		}
	}
}

# update(updateInfoExample)

# print(showDatabases())

# for i in range(10000):
# 	tableFile = open('./db/'+currentDatabase+'/'+'table1'+'.json', 'r')
# 	table = json.load(tableFile)

# 	print("Writing "+str(i))
# 	tableFile = open('./db/'+currentDatabase+'/'+'table1'+'.json', 'w')
# 	json.dump(table, tableFile)

