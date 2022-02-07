# Given lists
listOne = [11, 20, 20, 23, 11]
listTwo = [12, 23, 34, 31, 12]

# Print the lists
print("First List is: ", listOne)
print("Second List is:", listTwo)

# Declare a third list that will contain the result
thirdList = []

# Iterate through first list to get odd elements
for num in listOne:
    if num % 2 != 0:
        thirdList.append(num)

# Iterate through first list to get even elements
for num in listTwo:
    if num % 2 == 0:
        thirdList.append(num)

# Print result
print("Result List is:")
print(thirdList)
