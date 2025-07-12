mylist = [0,1,1,0,3]

def unique(mylist):
    
    a = 0
    for i in range(len(mylist)):
        for j in range(len(mylist)):
            if mylist[i] != mylist[j]:
                a = mylist[i]
    return a
print(unique(mylist))

    
    
    
    
    
    
    