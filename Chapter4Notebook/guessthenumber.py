import random

activeGame: bool = True
guessCounter: int = 0

#print(activeGame)


def guessNumberGame():
    global activeGame

    while activeGame:
        randomNumber = random.randint(1, 100)
        print(randomNumber)
       
        print("Guess my number between 1 and 100 with the fewest guesses:")

        getCorrectInput(randomNumber)



def getCorrectInput(randomNumber):
    guessedNumber = False

    while not guessedNumber:
        playerInput = int(input("Enter a integer number: "))
        winStatus = evalulateGuess(playerInput, randomNumber)
        
        if winStatus:
            guessedNumber = True
            checkPlayerInvolvement()


def evalulateGuess(guessedNumber, correctNumber):

    if guessedNumber > correctNumber:
        print("Too high. Try again.")
        incrementPlayerGuesses(1)
        return False
    elif guessedNumber < correctNumber:
         print("Too low. Try again.")
         incrementPlayerGuesses(1)
         return False
    elif guessedNumber == correctNumber:
        print("Congratulations. You guessed the number!")
        return True

def checkPlayerInvolvement():
    global activeGame

    print("You finished the game with " + str(guessCounter) + " guess(s)")

    if guessCounter <= 10:
        print("Either you know the secret or you got lucky!")
    elif guessCounter > 10:
        "You should be able to do better!"

    playerInput: int = int(input("Enter whether you want to play (0 = No and 1 = Yes): "))

    if playerInput == 1:
        print("Have fun playing!")
    elif playerInput == 0:
        activeGame = False
        print("Goodbye!")

def incrementPlayerGuesses(amountOfGuesses):
    global guessCounter
    guessCounter += amountOfGuesses

guessNumberGame()

print("user exited game")