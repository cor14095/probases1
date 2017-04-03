import csv
import json
import random
import os
import re
import itertools

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
	newDatabaseDirectory = (r'./') + databaseName
	if not os.path.exists(newDatabaseDirectory):
		#Create directory
		os.makedirs(newDatabaseDirectory)

		#Create metadata file
		metadataFile = {}
		metadataFile['tables'] = {}
		with open('./'+databaseName+'/'+databaseName+'Metadata.json', 'w') as output:
			json.dump(metadataFile, output)
	else:
		print('Database with name: "'+databaseName+'" already exists.')

def useDatabase(databaseName):
	databaseDirectory = (r'./') + databaseName
	if os.path.exists(databaseDirectory):
		global currentDatabase
		currentDatabase = databaseName
	else:
		print('Database with name: "'+databaseName+'" doesnt exists.')

NO_KEY = 0
FOREIGN_KEY = 1
PRIMARY_KEY = 2
# tableSchemaExample = {'tableName':'table1', 'columns':[{'columnName':'column1', 'key':1, 'constraintTable':'table2', 'constraintColumn':'column1,'type':'int'},{'columnName':'column2', 'key':1, 'type':'date'}]}
def createTable(tableSchema):
	if not os.path.isfile('./'+currentDatabase+'/'+tableSchema['tableName']+'.json'):
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
				if not os.path.isfile(r'./'+currentDatabase+'/'+column['constraintTable']+'.json'):
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
		file = open('./'+currentDatabase+'/'+tableSchema['tableName']+'.json', 'w')
		file.write('{}')

		#Create hash file
		hashFile = open('./'+currentDatabase+'/'+tableSchema['tableName']+'.hash', 'w')
		initialHash = {}
		for column in tableSchema['columns']:
			initialHash[column['columnName']] = {}
		json.dump(initialHash, hashFile)

		#Insert info in metadata file
		input = open('./'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
		metadata = json.load(input)
		tempTables = metadata['tables']
		tempTables[tableSchema['tableName']] = {}
		tempTables[tableSchema['tableName']]['columns'] = tableSchema['columns']
		tempTables[tableSchema['tableName']]['lastIndex'] = -1
		tempTables[tableSchema['tableName']]['deletedRows'] = 0
		metadata['tables'] = tempTables

		#Write info in metadata file
		with open('./'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'w') as output:
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
					constraintTableFile = open(r'./'+currentDatabase+'/'+column['constraintTable']+'.hash', 'r')
					constraintTable = json.load(constraintTableFile)
					#If it isnt
					if not (value in constraintTable[column['columnName']]):
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
	metadataFile = open('./'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
	metadata = json.load(metadataFile)

	#Check if table exists
	if insertInfo['tableName'] not in metadata['tables']:
		print("Error, table: "+insertInfo['tableName']+" doesnt exists in database: "+currentDatabase)
		return False

	#Perform type checks
	if(checkTypes(insertInfo, metadata) != True):
		print 'Error, types dont match with tha table types.'
		return False

	#Open hash file
	tableHashFile = open('./'+currentDatabase+'/'+insertInfo['tableName']+'.hash', 'r')
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
	tableHashFile = open('./'+currentDatabase+'/'+insertInfo['tableName']+'.hash', 'w')
	json.dump(tableHash, tableHashFile)
	resultingCSV = resultingCSV[:-1]

	

	#Open table file
	tableFile = open('./'+currentDatabase+'/'+insertInfo['tableName']+'.json', 'r')

	## VERSION LOADING JSON TO MEMORY ####################################################################################################
	# #Load JSON
	# tableJSON = json.load(tableFile)

	# #Add row
	# tableJSON[metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1] = resultingCSV

	# #Write table file
	# json.dump(tableJSON, open('./'+currentDatabase+'/'+insertInfo['tableName']+'.json', 'w'))
	######################################################################################################################################






	## VERSION ALTERING FILE DIRECTLY ####################################################################################################
	currentJSON = tableFile.readlines()[0]
	if(currentJSON == "{}"):
		newJSON = currentJSON[:-1] + '"' + str(metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1) + '":"' + resultingCSV + '"}'
	else:
		newJSON = currentJSON[:-1] + ',"' + str(metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1) + '":"' + resultingCSV + '"}'
	tableFile = open('./'+currentDatabase+'/'+insertInfo['tableName']+'.json', 'w')
	tableFile.write(newJSON)
	######################################################################################################################################
	
	#Update index in metadata
	# print(metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1)
	metadata['tables'][insertInfo['tableName']]['lastIndex'] = metadata['tables'][insertInfo['tableName']]['lastIndex'] + 1

	#Write metadata
	json.dump(metadata, open('./'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'w'))

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
	tableFile = open('./'+currentDatabase+'/'+deleteInfo['tableName']+'.json', 'r')
	jsonFile = tableFile.readlines()[0]

	newJson = deleteIndexes(deleteInfo['indexes'], jsonFile)

	tableFileOutput = open('./'+currentDatabase+'/'+deleteInfo['tableName']+'.json', 'w')
	tableFileOutput.write(newJson)

	return True

# Example call: cartesianProduct(['table1', 'table2', 'table3'])
def cartesianProduct(tables):
	#Open metadata file
	metadataFile = open('./'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
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
		tableFile = open('./'+currentDatabase+'/'+table+'.json', 'r')
		jsonFile = json.load(tableFile)
		tempData = []
		for key, value in jsonFile.items():
			tempData.append(value)
		data.append(tempData)

	#Generate combinations
	cartesianProductResult = itertools.product(*data)

	#Clean
	cartesianProductResult = map((lambda x : (','.join(map(str,x)))), cartesianProductResult)

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



# whereInfoExample = {'tableName': 'table1', 'filterBy': 'column2', 'filterType': 'not', 'value':'12'}
# def whereFilter(whereInfo):
# 	#Open table file
# 	tableFile = open('./'+currentDatabase+'/'+insertInfo['tableName']+'.json', 'r')

# 	if(selectInfo['filterBy'] == ''):







































# Testing area

createDatabase('database1')
createDatabase('database2')

useDatabase('database1')

tableSchemaExample = {'tableName':'table2', 'columns':[{'columnName':'column1', 'key':2, 'type':'date'},{'columnName':'column2', 'key':0, 'type':'string'}]}
createTable(tableSchemaExample)

tableSchemaExample = {'tableName':'table1', 'columns':[{'columnName':'column1', 'key':1, 'constraintTable':'table2', 'constraintColumn':'column1', 'type':'date'},{'columnName':'column2', 'key':0, 'type':'int'}]}
createTable(tableSchemaExample)



print("Inserting into table 2")
insertRecord({'tableName': 'table2', 'columns':['column1', 'column2'], 'values':['12-12-1212', 'Bryan Chan']})

print("Inserting into table 2")
insertRecord({'tableName': 'table2', 'columns':['column1', 'column2'], 'values':['24-24-2424', 'Alejandro Cortes']})

print("Inserting into table 1")
insertRecord({'tableName': 'table1', 'columns':['column2', 'column1'], 'values':[12, '12-12-1212']})

print("Inserting into table 1")
insertRecord({'tableName': 'table1', 'columns':['column2', 'column1'], 'values':[24, '12-12-1212']})

print("Inserting into table 1")
insertRecord({'tableName': 'table1', 'columns':['column2', 'column1'], 'values':[36, '12-12-1212']})

print("Cartesian product")
metadataResult, cartesianProductResult = cartesianProduct(['table1', 'table2'])

print(metadataResult['columns'])
print(cartesianProductResult)

# print(showDatabases())

# deleteRows({'tableName':'table1', 'indexes':range(0,2999,2)})

# checkFile = open(r'./database1/table1.json')
# checkFile = json.load(checkFile)


# print(checkFile['2532'])



# firstResult = dumbSearch('0')
# secondResult = dumbSearch('1')
# thirdResult = dumbSearch('2')

# with open('exampleDictionary.json') as input:
# 	exampleDictionary = json.load(input)
# 	firstResult = exampleDictionary['0']['0']
# 	secondResult = exampleDictionary['0']['1']
# 	thirdResult = exampleDictionary['0']['2']

#getColumns('example')
# print(getData('example', [0,1]))

# generateExampleCSV()
# generateDictionary('example')