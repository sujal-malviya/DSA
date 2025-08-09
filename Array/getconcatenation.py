# Get Concatnation of array -



nums = map(int,input("enter the list: ").split(" "))
mylist = list(nums)
def getConcatenation(nums: list[int]) -> list[int]:
    ans = []
    for i in range(len(mylist)):
        ans.append(mylist[i])
    ans.extend(ans)
    return ans

result = getConcatenation(mylist)
print(result)