#Use a for loop to iterate through prints
# for index, range in ___

#on first iteration, print the number, square, and cube
#second iteration: seteverything to 0
# third iteration: set everything to 1
#fourth iteration: set numbers in respect to powers of 2 (2, 4, 8)
#fifth iteration: set numbers in respect to powers of 3 (3, 9, 27)
#sixth iteration: set numbers in respect to powers of 4 (4, 16, 64)
#seventh iteration: set numbers in respect to powers of 5 (5, 25, 125)

#different category names
number = "number"
square = "square"
cube = "cube"

for index in range(1, 8): # print 7 times
    
    if index == 1:
       print(f'{number} {square} {cube}', sep = "\t") #declares the names at the top of the column
    
    if index == 2:
        secondIterationNumber = 0
        secondIteration = '0:\t0\t0'
        print(f'{secondIterationNumber: >6}\t{secondIterationNumber: >5}\t{secondIterationNumber: >2}')

    if index == 3:
        thirdIterationNumber = 1
        print(f'{thirdIterationNumber: >6}\t{thirdIterationNumber: >5}\t{thirdIterationNumber: >2}')

    if index == 4:
        fourthIterationNumber = 2
        print(f'{fourthIterationNumber: >6}\t{fourthIterationNumber * 2: >5}\t{fourthIterationNumber ** 3: >2}')
    
    if index == 5:
        fifthIterationNumber = 3
        print(f'{fifthIterationNumber: >6}\t{fifthIterationNumber ** 2: >5}\t{fifthIterationNumber ** 3: >2}')
    
    if index == 6:
        sixthIterationNumber = 4
        print(f'{sixthIterationNumber: >6}\t{sixthIterationNumber ** 2: >5}\t{sixthIterationNumber ** 3: >2}')

    if index == 7:
        seventhIterationNumber = 5
        print(f'{seventhIterationNumber: >6}\t{seventhIterationNumber ** 2: >5}\t{seventhIterationNumber ** 3: >2}')