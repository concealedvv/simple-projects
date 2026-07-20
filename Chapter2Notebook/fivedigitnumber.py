#Split 5 digit number into individual digits split by three spaces
#Input --> when it's a string, split it manually
# add manual spaces with concacentation 
# return final number

number = int(input("Enter a five digit number: "))
print(str(number) + " was selected" + "\n")

firstNumber = (number // 10**0) % 10
secondNumber = (number // 10**1) % 10
thirdNumber = (number // 10**2) % 10
fourthNumber = (number // 10**3) % 10
fifthNumber = (number // 10**4) % 10

print(str(firstNumber) + "   ", str(secondNumber) + "   ", str(thirdNumber) + "   ", str(fourthNumber) + "   ", str(fifthNumber) + "   ")