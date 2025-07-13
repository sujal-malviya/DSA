# Alternate numbers -
mylist = [10,20,30,40,50]

def alternate(mylist):
    mylist1 = []
    for i in range(len(mylist)):
        if (i%2==0):
            x = mylist[i]
            mylist1.append(x)
    return mylist1
print(alternate(mylist))