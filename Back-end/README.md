createDatabase:
{
  'type': 'CREATE',
  'ID': 'IDX'
}

alterDatabase:
{
  'type': 'ALTER',
  'target': 'IDX',
  'new': 'IDX'
}

dropDatabase:
{
  'type': 'DROP',
  'target': 'IDX'
}

showDatabase:
{
  'type': 'SHOW'
}

useDatabase:
{
  'type': 'USE',
  'target': 'IDX'
}

createTable:
{
  'tableName':'table1',
  'columns': [
    {
      'columnName':'column1',
      'key':1,  // 0 = NO_KEY, 1 = FOREIGN_KEY y 2 = PRIMARY_KEY
      'constraintTable': 'table2',
      'constraintColumn': 'column1',
      'type':'int'
      },
    {
      'columnName':'column2',
      'key':0,
      'type':'date'
    }
  ]
}
