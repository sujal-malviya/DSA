#output = [24,12,8,6]
mylist = [1,2,3,4] 
def output1(mylist):
    prod = 1
    for i in range(len(mylist)):
        k = 0
        j =i+1
        for j in range(len(mylist)):
            k = j
            if (k==(len(mylist))):
                break
            if(i==j):
                continue
            for k in range(len(mylist)):
                mylist[k] = mylist[k] * prod
            
        return mylist
        

print(output1(mylist))


#[1 ,2 ,3,4]  [24,12,8,6]   1st index   ignore then multily all.
#[24,12,8,6]   2nd index ignore then multiply all. 3rd index ignore multipy all.
#prod = 1      4*3*2*1      4*3    4*2   3*2
#mylist[i] = mylist[i]*prod