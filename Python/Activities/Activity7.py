numbers = list(input("Enter a sequence of comma separated values: ").split(","))
sum1 = 0

for number in numbers:
    sum1 += int(number)

print(sum1)
