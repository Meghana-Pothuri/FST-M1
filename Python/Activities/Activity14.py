def fibonacci(number):
    if number <= 1:
        return number
    else:
        return fibonacci(number - 1) + fibonacci(number - 2)


nterms = int(input("How many Fibonnaci numbers to generate?: "))

if nterms <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence is: ")
    for i in range(nterms):
        print(fibonacci(i))
