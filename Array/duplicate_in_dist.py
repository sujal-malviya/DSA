# Duplicate in K Distance - 
mylist = [1,2,3,1,4,5]

def Duplicate_AtDist(mylist,k):
    for i in range(len(mylist)):
        for j in range(i+1,min(i+k+1,len(mylist))):
            if(mylist[i] == mylist[j]):
                return "YES"
    return "NO"

print(Duplicate_AtDist(mylist,3))