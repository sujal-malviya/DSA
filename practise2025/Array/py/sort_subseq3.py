# Sorted Subsequence of size 3

def Sort_subsequence_Triplet(mylist):
    n = len(mylist)
    
    for i in range(n):
        for j in range(i + 1, n):
            for k in range(j + 1, n):
                if mylist[i] < mylist[j] < mylist[k]:
                    return f"{mylist[i]}, {mylist[j]}, {mylist[k]}"
    
    return "No triplet found"


mylist = [12, 11, 10, 5, 6, 2, 30]
result = Sort_subsequence_Triplet(mylist)
print(result)
