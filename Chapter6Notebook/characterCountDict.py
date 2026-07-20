userString: str = str(input("Enter a sentence: "))

textSplitString: str = userString.split() and userString.lower() # splits string and makes it lowercase to make it easier to work with
print(textSplitString)

lowerAlphabetList: set = set(chr(index) for index in range(ord('a'), ord('z') + 1)) # set comphrension to generate a set between a to z

textDictonary: dict = {}

def countCharacterCount(textSplitString: str):
    for item in textSplitString:
        if item in textDictonary:
            textDictonary[item] += 1 # updating previous key value pair
        else:
            textDictonary[item] = 1 # creating new key value pair

countCharacterCount(textSplitString)

print(f'{"WORD":<12}COUNT') # organizing the headers

for word, count in sorted(textDictonary.items()):
   print(f'{word:<12} {count} ')

def determineAbsentLetters(textDict: dict, lowercaseAlphabetList: set) -> set:
    setDict: set = set(item for item in textDict if item.isalpha()) # list comprehension so that only letters are included and not whitespace
    differingLetters: set = set(setDict.symmetric_difference(lowerAlphabetList)) # gets all letters that are not similar to the original string
    return differingLetters
    

differingLetters = determineAbsentLetters(textDictonary, lowerAlphabetList)

for item in differingLetters:
    print(f" the letter {item} was not in the original string")
