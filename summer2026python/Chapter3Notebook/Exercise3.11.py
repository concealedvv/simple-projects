#Determine the miles per gallon
#Use sentinel value to end the loop
#Prompt user to enter miles
#Prompt user to enter gallons
#Keep a tracker for the returned calculated results
#Use a while loop

sentinelValueReached = False
sentinelValueEnder = -1

totalMilesPerGallon = 0 # this increases to calculate the average miles per gallon
successfulResultCounter = 0 # using this to keep track of what to divide by at the end

while sentinelValueReached == False:
    print("Enter -1 to end")
    Miles = int(input("Enter miles driven: "))
    if Miles == sentinelValueEnder:
        sentinelValueReached = True
        print("end loop")
        break # confirms the loop ends
    

    Gallons = int(input("Enter gallons used: "))
    if Gallons == sentinelValueReached:
        sentinelValueReached = True
        print("end loop")
        break # confirms the loop ends

    resultMilesPerGallons = Miles / Gallons
    totalMilesPerGallon += resultMilesPerGallons
    successfulResultCounter += 1
    print("updated Result Counter")
    print("the total miles per gallon is " + str(resultMilesPerGallons))

    #Loop ends here 
print("the total miles per gallon is " + str(totalMilesPerGallon))

averageResultsAmongInputs = totalMilesPerGallon / successfulResultCounter
print("The average miles per gallon is " + str(averageResultsAmongInputs))