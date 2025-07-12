#Missing Number - Sum = n(n+1)/2
mylist = [13,11,14]
def missing(mylist):
    indx = 0
    for i in range(len(mylist)):
        j= i+1
        if (j == len(mylist)):
            break
        subt = abs(mylist[i] - mylist[j])
        if(subt == 1):
            continue
        else:
            indx = mylist[i]+1;
    return indx
print(missing(mylist))                
    