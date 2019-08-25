#In this program, we will create a program, using functions that,
#when ran, will print 25 blank lines on the screen.
#First, we write a write and define the function to print a single blank line.
def new_line():
    print()
#The print() keyword with no value between parenthesis prints a blank line.
#Next, we write a defined function that uses our previous defined function and
#its parameters to print three blank lines. So we are using the new_line
#function three times to print three new lines.
def three_lines():
    new_line()
    new_line()
    new_line()
#Now we write a function that prints nine lines which uses the parameters of
#our three_lines function. The three_lines function prints three new_lines. So
#we will call on that function three times to print nine lines.
print("Now printing 9 lines.")
def nine_lines():
    three_lines()
    three_lines()
    three_lines()
nine_lines() #This is the call for the function to print 9 lines.
print("Now printing 25 lines.")
#Now we will create our clear_screen function which produces a total of 25 blank
#lines. It utilizes all three defined functions to do this. Using new_line to
#print one blank line, three_lines twice to print 6 blank lines and nine_lines
#twice to print 18 blank lines, for a total of 25 blank lines.
def clear_screen():
    new_line()
    three_lines()
    three_lines()
    nine_lines()
    nine_lines()
clear_screen()
#Finally, we use the call to function clear_screen in order to print the 25
#blank lines. This utilizes the parameters of all of our defined functions.
