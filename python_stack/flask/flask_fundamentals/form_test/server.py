#form_test

from flask import Flask, render_template, request, redirect  , session
app = Flask(__name__)
app.secret_key = 'keep it secret, keep it safe' # set a secret key for security purposes

# our index route will handle rendering our form
@app.route('/')
def index():
    return render_template("index.html")


@app.route('/users', methods=['POST'])
def create_user():
    print("Got Post Info")
    
    # Here we add two properties to session to store the name and email
    session['username'] = request.form['name']
    session['useremail'] = request.form['email']

    return redirect("/show")	# changed this line!

# adding this method
@app.route("/show")
def show_user():
    print("Showing the User Info From the Form")

    return render_template("show.html")





if __name__ == "__main__":
    app.run(debug=True)
