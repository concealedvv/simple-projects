#Write a summarize_letters function
# Loop through string and return multiple tuples each containing their unique letter and how often they appear
# Loop through the lettersInsideString and then calculate how frequent it is added 

customizableString: str = "fjwoifnhwofjf" # this is the string that you customize

def summarize_letters(stringExample: str):
    lettersInsideString: list = []
    usedLetters: list = []

    modifiedStringExample: str = stringExample.lower() #created this variable to set all individual letters to lowercase (it is not case sensitive so it doesn't matter)

    for iteration, letter in enumerate(modifiedStringExample): # used both index and letter to avoid manipulating tuples
        alreadyAppended = False

        letterAppended = any(letter in tuple for tuple in enumerate(usedLetters))

        if iteration >= 1 and letterAppended: # it must complete the loop at least once so it can get the first value appended
            print("the letter is already covered")
            print("the letter is " + letter)
            alreadyAppended = True

        if letter in modifiedStringExample and letter.isalpha() and not alreadyAppended: # if it's a letter and not already used, then do so

            caseInsensitiveLetter = letter.lower() or letter.upper()

            count = countForLetters(modifiedStringExample, caseInsensitiveLetter)

            letterCountTuple = (letter, count)
            lettersInsideString.append(letterCountTuple)
            print(f"added {letter} to the lettersInsideString[] table with a count of {count}")
            
            usedLetters.append(letter)
            print("sigma")

            print(f"usedLetters table appended {letter}")
            print("-" * 90, end="")


    return lettersInsideString

# split this into it's own function for readability
def countForLetters(lowercaseString: str, targettedLetter: str): 
    count = lowercaseString.count(targettedLetter)
    print(count)
    return count

    

letterTable = summarize_letters(customizableString)
print(letterTable)

#another way to wrtie the table above (this is too long on one line for me)
#lettersInsideString: list = [letter for index, letter in enumerate(stringExample) if letter.isalpha()] # table that contains only letters