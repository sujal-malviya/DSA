# score of string -

def scoreOfString(s: str) -> int:
    result = 0
    for i in range(len(s)):
        for j in range(len(s)):
            if j == i+1:
                result += abs(ord(s[i])-ord(s[j]))
    return result

s = input()

result1 = scoreOfString(s)
print(result1)