#The following is a simple code to sort a list (in this case, the list was a list of fruits) in alphabetical order
#The location of the file must be entered first and the desired output file location is entered second.
InFile = open(r'','r')#opens unsorted_fruits file. The location of the file to be read must be entered here.
OutFile = open(r'','w')#creates sorted_fruits file. The location of the sorted list must be entered here.
fruit=InFile.readlines()#reads unsorted_fruits
fruit.sort()#sort fruit
for fruit in fruit:#iteration loop to read fruit
    if fruit != "\n":#if fruits are not new line
        OutFile.write(fruit)#wirte to sorted_fruits file
        print(fruit)#print sorted fruits
InFile.close()#close unsorted_fruits file
OutFile.close()#close sorted_fruits file
