maxDigitLength: int = 10

def verifyNumber():
    numberVerified: bool = False
    
    while not numberVerified:
        userInputNumber = int(input("Enter an integer amount less than 10 characters: \n"))
        
        if len(str(userInputNumber)) < maxDigitLength:
            numberVerified = True
            return userInputNumber

userInputNumber: float = verifyNumber() 

asteriskAmount = maxDigitLength - len(str(userInputNumber))

print(str(asteriskAmount) + " is the asterisk amount")

formattedString = f"{userInputNumber:*>{asteriskAmount}.2f}"

print(formattedString)