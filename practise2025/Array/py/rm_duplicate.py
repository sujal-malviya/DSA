def remove_duplicate(mylist):
    result = []
    for item in mylist:
        if item not in result:
            result.append(item)
    return result

print(remove_duplicate([2, 2, 2, 2]))  # Output: [2]
