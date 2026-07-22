sentence: str = "jump the computer" # make sure every word has at least two characters

textSplit = sentence.split()

modifiedPigLatinWords = []

vowelList = ['a', 'e', 'i', 'o', 'u']

def turnWordtoPigLatin(word: str):
    if word[0].lower() in vowelList: # just add "ay" to the end of a word that starts with a vowel
        print("we did it right")
        newWord = word[0] + "ay"
        print(newWord)
        return newWord
    
    startingLetter = word[0]
    endingSuffix = "ay"
    removedStartingLetter = word[1:]
    
    newWord = removedStartingLetter + startingLetter + endingSuffix
    print(newWord)
    return newWord

for word in textSplit:
    newWord = turnWordtoPigLatin(word)
    modifiedPigLatinWords.append(newWord)
    
pigLatinSentence: str = " ".join(modifiedPigLatinWords)

print(pigLatinSentence)