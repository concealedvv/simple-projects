def initializeUserNumInput() -> float:
    determinedNumber: bool = False

    while (not determinedNumber):
        userNumInput: float = float(input("Enter a number less than 1000: "))

        if userNumInput > 1000 or userNumInput < 0: # serves as a guard case to prevent number being outside of the assignment's constraint
            print("this number is invalid")
            userNumInput: float = float(input("Enter a number less than 1000: "))

        determinedNumber = True
        return userNumInput
    
userNumInput: float = initializeUserNumInput() # convert the number to a string in order to gain access to helpful string methods

dictonary_ones = {
   "0": "", 
   "1": "One", 
   "2": "Two", 
   "3": "Three", 
   "4": "Four", 
   "5": "Five", 
   "6": "Six", 
   "7" : "Seven", 
   "8": "Eight", 
   "9": "Nine", 
   "10": "Ten"
}

dictonary_tens = {
    "20": "Twenty", 
    "30": "Thirty",
    "40": "Forty",
    "50": "Fifty",
    "60": "Sixty",
    "70": "Seventy",
    "80": "Eighty", 
    "90": "Ninety", 
    "100": "Hundred"
}

def gettingNumbersBeforePoint(Number: float) -> str:
    stringNumber: str = str(Number)
    numbersBeforePoint: list = []

    for digit in stringNumber:
        if digit == ".":
            break
        print(digit)
        numbersBeforePoint.append(digit)
    
    combinedString: str = "".join(numbersBeforePoint)
    print("the combined string is " + combinedString)
    digitsBeforePoint: int = int(len(combinedString))


    return combinedString


#All code gets ran in solvingNumberToWord function
def solvingNumberToWord(userNumInput: float):

    numberListBeforePoint = gettingNumbersBeforePoint(userNumInput)
    print(numberListBeforePoint)


solvingNumberToWord(userNumInput)
