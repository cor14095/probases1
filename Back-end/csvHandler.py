import csv
import json
import random
import os

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

# tableSchemaExample = {'tableName':'table1', 'columns':[{'columnName':'column1', 'key':0, 'type':'int'},{'columnName':'column2', 'key':1, 'type':'date'}]}
def createTable(tableSchema):
	if not os.path.isfile('./'+currentDatabase+'/'+tableSchema['tableName']+'.csv'):
		#Create file
		file = open('./'+currentDatabase+'/'+tableSchema['tableName']+'.csv', 'w')

		#Insert info in metadata file
		input = open('./'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
		metadata = json.load(input)
		tempTables = metadata['tables']
		tempTables[tableSchema['tableName']] = tableSchema['columns']
		metadata['tables'] = tempTables

		#Write info in metadata file
		with open('./'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'w') as output:
			json.dump(metadata, output)

		print('Table succesfully created')
	else:
		print('Table with name: '+tableSchema['tableName']+' already exists.')

def getType(stringyType):
	if(stringyType == "int"):
		return type(1)
	elif(stringyType == "float"):
		return type(1.0)
	else:
		return False


# insertInfoExample = {'tableName': 'table1', 'columns':['id','nombre','edad'], 'values':[1, 'Perry', 20]}
def insertRecord(insertInfo):
	#Perform parity check
	if(len(insertInfo['columns'] != len(insertInfo['values']))):
		print 'Error, values quantity doesnt match columns quantity'
		return False

	#Perform type checks
	input = open('./'+currentDatabase+'/'+currentDatabase+'Metadata.json', 'r')
	metadata = json.load(input)

	columnsInTable = metadata['tables'][insertInfo['tableName']]
	for i in range(len(insertInfo['columns'])):
		if(type(insertInfo['values'][i]) == getType(metadata['tables'][insertInfo['tableName']]))

	#Open table file
	tableName = insertInfo['tableName']






































# Testing area

createDatabase('database1')

tableSchemaExample = {'tableName':'table1', 'columns':[{'columnName':'column1', 'key':0, 'type':'int'},{'columnName':'column2', 'key':1, 'type':'date'}]}
createTable(tableSchemaExample)

tableSchemaExample = {'tableName':'table2', 'columns':[{'columnName':'column1', 'key':1, 'type':'int'},{'columnName':'column2', 'key':0, 'type':'string'}]}
createTable(tableSchemaExample)

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