# Custom function to calculate sum
def calculate_sum(numbers):
    sumNum = 0
    for number in numbers:
        sumNum += number
    return sumNum


# Define the list of numbers
numList = [11, 44, 62, 9, 66]

# Call the sum() function with numList as argument
result = calculate_sum(numList)

# Print result with message
print("The sum of all the elements is: " + str(result))
