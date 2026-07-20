def initializeUserNumInput() -> float:
    determinedNumber: bool = False

    while (not determinedNumber):
        userNumInput: float = float(input("Enter a number less than 1000: "))

        if userNumInput > 1000 or userNumInput < 0: # serves as a guard case to prevent number being outside of the assignment's constraint
            print("this number is invalid")
            userNumInput: float = float(input("Enter a number less than 1000: "))
        
        else:
            determinedNumber = True
        
        return userNumInput
    
userNumInput: float = initializeUserNumInput() # convert the number to a string in order to gain access to helpful string methods

dictonary_units = { # any number below 20 
    0: "", 
    1: "One", 
    2: "Two", 
    3: "Three", 
    4: "Four", 
    5: "Five", 
    6: "Six", 
    7 : "Seven", 
    8: "Eight", 
    9: "Nine", 
    10: "Ten",
    11: "Eleven",
    12: "Twelve",
    13: "Thirteen",
    14: "Fourteen",
    15: "Fifteen",
    16: "Sixteen",
    17: "Seventeen",
    18: "Eighteen",
    19: "Nineteen"
}

dictonary_tens = {
    20: "Twenty",
    30: "Thirty",
    40: "Forty",
    50: "Fifty",
    60: "Sixty",
    70: "Seventy",
    80: "Eighty",
    90: "Ninety"
}

def turnNumberToWords(num: float):
    if num < 20:
        return dictonary_units[num]
    
    elif num < 100:
        print("Test")
        return dictonary_tens[10 * (num // 10)] + " " + dictonary_units[num % 10]
    
    elif num < 1000:
        return dictonary_units[num // 100] + " Hundred " + "" + dictonary_tens[int(str(num)[1]) * 10] + " " + dictonary_units[int(str(num)[2])]
    # Use integer division to take apart the hundreds place value, access the 2nd digit of the number and multiply by 10 to get the tenths place, and get the 3rd digit of the number by simply getting the index of ones place
    else:
        return "One thousand" # it's automatically 1,000 as it's not accounted for in the previous if statements
    
wordString: str = turnNumberToWords(userNumInput)

print("The number to word conversion is " + wordString)