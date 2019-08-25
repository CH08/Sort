#This program is a simple calculator that will allow the input of an integer not
#including 0, to add, subtract, multiply or divide by another ineger.
#First, we define our functions and set our parameters for our functions.
def add(number_1,number_2): #add function with parameters
    return number_1+number_2 #instructions for add function
def subtract(number_1,number_2): #subtract function
    return number_1-number_2 #instructions for subtract function
def multiply(number_1,number_2): #multiply function
    return number_1*number_2 #instructions for myltiply function
def divide(number_1,number_2): #divide function
    return number_1/number_2 #instructions for divide function
#Now we create use the int and input key words to tell Python that we want only
#integers used and also that we want that integer assigned to number_1. We tell
#Python to print the instructions to enter the first number.
number_1=int(input("Enter your first number: "))
#Now we let Python know that we want any integer but 0 to be used. If it is used
#Python will ask the person to reenter the first number.
if number_1==0:
    int(input("Enter your first number: "))
#Here we tell Python to print the operation selections.    
print("Operations")
print("1. Add")
print("2. Subtract")
print("3. Multiply")
print("4. Divide")
#Now we ask the user which operation they would like to use and this uses the
#input key word to store the operation and reverts to our previous defined
#functions in order to get instructions.
selection=input("Select an operation: ")
#Now we tell the user to select their second integer.
number_2=int(input("Enter your second number: "))
if number_2==0: #Here we tell Python that we want all integers except 0 used.
    int(input("Enter your second number: ")) #If 0 is used, it asks the user to
#reenter the second number.
#Now we tell Python what to with the selected operator.
if selection=='1': #If 1, add number 1 and number 2 integer and so on.
    print(number_1+number_2)
elif selection=='2':
    print(number_1-number_2)
elif selection=='3':
    print(number_1*number_2)
elif selection=='4':
    print(number_1/number_2)
else:
    print("Not a valid operation.") #If anything other than 1-4 are entered for
#the operator, this error message is printed.

