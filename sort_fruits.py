InFile = open(r'C:\Users\harde\Documents\UoPeople\CS 1101 programming\sorted_fruits\unsorted_fruits.txt','r')#opens unsorted_fruits file
OutFile = open(r'C:\Users\harde\Documents\UoPeople\CS 1101 programming\sorted_fruits\sorted_fruits.txt','w')#creates sorted_fruits file
fruit=InFile.readlines()#reads unsorted_fruits
fruit.sort()#sort fruit
for fruit in fruit:#iteration loop to read fruit
    if fruit != "\n":#if fruits are not new line
        OutFile.write(fruit)#wirte to sorted_fruits file
        print(fruit)#print sorted fruits
InFile.close()#close unsorted_fruits file
OutFile.close()#close sorted_fruits file
