#Create a seven letter string
#For each char in string, group that letter to its respective vanity number
#Loop through the number and append a number to its 

startingString: str = "AIRPORT" # needs 7 letters 

letterList: list = [
        ('abc'),
        ('def'), 
        ('ghi'),
        ('jkl'), 
        ('mno'), 
        ('pqrs'),  
        ('tuv'), 
        ('wxyz')
    ]
    
def phoneDigitGenerator(startingString):
    lowercaseString = startingString.lower() # use this modified string so it's easier to iterate through it

    indexOffset: int = 2 # this is necessary because our range is 2-9 and the index starts at 0
    phoneNumberList: list = []

    for letter in lowercaseString:
        for index, group in enumerate(letterList):
            if letter in group:
                phoneNumberList.append(str(index + indexOffset))
                print(phoneNumberList)
                print()

    return phoneNumberList

phoneNumberDigitList = phoneDigitGenerator(startingString)

def convertPhonelistToString(phoneNumberList):
    phoneNumberString: str = ''.join(phoneNumberList)
    return phoneNumberString

phoneNumberString = convertPhonelistToString(phoneNumberDigitList)
print(phoneNumberString + " is a possible phone number for the seven digit string")

