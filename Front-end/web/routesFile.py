from flask import Flask, request,render_template
import sys
#sys.path.append("C:/Users/Freddie/Documents/Desktop/dbTest/Front-end/antlr")
sys.path.append("../antlr")
import runSQL

app = Flask(__name__)

currentDB = ""
errors = ""

@app.route('/home')
@app.route("/")
def hello():
    return  render_template('home.html')

@app.route("/showDb", methods=['GET', 'POST'])
def showOptions():
	data = str(request.args.get('datas'))
	with open("../antlr/input/input.sql","w") as text_file:
			text_file.write(data)
	runSQL.runSQL("../antlr/input/input.sql",currentDB)
	return 



@app.route("/createDb", methods=['GET', 'POST'])
def createDb():
	return render_template('createDb.html')


@app.route("/viewDb", methods=['GET', 'POST'])
def viewDb():
	
	if(request.method == 'POST'):
		querys = request.form['querys']
	else:
		querys = request.args.get('querys')
		loadDb = request.args.get('file')
		newDB = request.args.get('newDB')
	if(querys):
		with open("../antlr/input/input.sql","w") as text_file:
			text_file.write(querys)
		if('use ' in querys.lower()):
			currentDB = querys[querys.index("use ") + len("use "):]
			if(currentDB.endswith(';')):
				currentDB = currentDB[:-1]

	elif(loadDb):
		currentDB = loadDb
	elif(newDB):
		with open("../antlr/input/input.sql","w") as text_file:
			text_file.write(newDB)
		currentDB = newDB.rsplit(None,1)[-1]
		if(currentDB.endswith(';')):
			currentDB = currentDB[:-1]
		#print currentDB

	errors = runSQL.runSQL("../antlr/input/input.sql",currentDB)
	
	return render_template('viewDb.html',errors = errors)

if __name__ == "__main__":
    app.run()
