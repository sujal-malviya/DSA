#output = [24,12,8,6]
mylist = [1,2,3,4] 
def output1(mylist):
    output = []
    for i in mylist:
        prod =1 
        for j in mylist:
            if (i==j):
                continue
            prod = prod*j
        output.append(prod)
    return output
print(output1(mylist))
    # prod = 1
    # for i in range(len(mylist)):
    #     k=i
    #     if k==(len(mylist)):
    #         break
    #     if(i==k):
    #         continue
    #     for j in range(len(mylist)):
    #         mylist[j] = mylist[j] * prod
    #         mylist[i] = mylist[j]
    #     return mylist
        

# print(output1(mylist))


#[1 ,2 ,3,4]  [24,12,8,6]   1st index   ignore then multily all.
#[24,12,8,6]   2nd index ignore then multiply all. 3rd index ignore multipy all.
#prod = 1      4*3*2*1      4*3    4*2   3*2
#mylist[i] = mylist[i]*prod