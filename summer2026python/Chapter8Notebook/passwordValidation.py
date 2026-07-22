import re
import string

#part A
password1: str = "I-have-no-friends-do-my-huigh"

def verifyPassword1(password1: str):
    requiredAmountOfWords: int = 5
    splitPassword = re.split("[-_,. ]", password1)
    print(splitPassword)
    lengthOfSplit: int = len(splitPassword) - 1
    
    if lengthOfSplit >= requiredAmountOfWords:
        print("It has enough splits, signifying enough words separated")
    else:
        print("It doesn't have enough words, so it is not a valid password")
        return False

    return True
      
firstPasswordValidity = verifyPassword1(password1)

if firstPasswordValidity:
    print("password1 is valid")
else:
    print("password1 is not valid")



password2: str = "I want ofo! 98L3"
def verifyPassword2(password2: str):
    minimumCharacterLength: int = 8
    characterLength = len(password2.replace(" ",""))
    print(characterLength)
    
    print("made it here")
    if characterLength < minimumCharacterLength:
        print("not a valid password length") # exit out of function as the password is too small
        return False
    
    print("Passed this")
    if not re.search(r'[A-Z]', password2):
        return False
    
    if not re.search(r'[a-z]', password2):
        return False
    
    if not re.search(r'[0-9]', password2):
        return False
    
    if not re.search(r'[!@#$%<^>&*]', password2):
        return False
    
    return True
    
secondPasswordValidity: bool = verifyPassword2(password2)

if secondPasswordValidity:
    print("password2 is a valid password")
else:
    print("password2 is not a valid password")