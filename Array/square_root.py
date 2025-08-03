# Square Root -
import math
n = int(input())

def square_root(n:int):
    sq = n**1/2
    return sq

result = square_root(n)
print(result)

# Naive Approach+
def sqr_root(n):
    res = 1
    while  res * res <= n :
          
        res += 1    
    return res -1

result1 = sqr_root(n)
print(result1)
#  1st iter... (1**1 <= 11) True  
# res = 2
# 2nd iter... (2**2 <= 11)  True
# res = 3
#  3rd iter..   (3**3 <= 11)  True 
# res = 4
#  4th iter... (4**4 <= 11)  False
# return res-1 