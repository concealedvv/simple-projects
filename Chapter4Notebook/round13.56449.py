number: int = 13.56449

def roundNumber():
    for index in range(0, 4):
        roundedNumber: float = round(number, index)
        if index == 0:
            print(str(roundedNumber) + " is when it is rounded to the nearest integer.")
        else:
                print(str(roundedNumber) + " is when it is rounded to " + str(index) + " places.")

roundNumber()