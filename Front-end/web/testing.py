from flask import Flask, request,render_template
import runSQL
app = Flask(__name__)

@app.route("/")
def hello():
    return  render_template('home.html')

@app.route("/main", methods=['GET', 'POST'])
def test():
	return runSQL.main()
	
@app.route("/createDb", methods=['GET', 'POST'])
def createDb():
	return render_template('createDb.html')

@app.route("/viewDb", methods=['GET', 'POST'])
def viewDb():
	db = request.args.get('file')
	print db 
	return render_template('viewDb.html')

if __name__ == "__main__":
    app.run()