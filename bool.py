#Writing a compare function that returns values of 1,0,-1 based on parameters.
def compare(a,b):#defining compare function and parameters. This will be used with
#the static calls as well as the user inputs.
    if(a>b):#If a>b return 1
        return (1)#returns the value of 1 if a and b meet specific parameters.
    elif(a==b):#else if a and b are equal (true) then return 0.
        return (0)
    elif(a<b):#else if a is less than b, return -1.
        return (-1)
#The following print our static calls to the compare function.
print(compare(5,2))
print(compare(2,5))
print(compare(3,3))
#Now we create a function which allows for user input of values.
def values():
    #integer values requested from user.
    a=int(input('Enter a value for a: '))
    b=int(input('Enter a value for b: '))
    compare(a,b)#calls compare function for values entered.
    print(compare(a,b))#prints the output parameters of compare function.
values()#calls for values function once
values()#calls for values function a second time.
values()#and a third time.