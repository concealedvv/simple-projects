import numpy as np

broadcastArray = np.arange(4).reshape(2,2) # creates a 2x2 array with the elements being between 0-3

broadcastArray **= 3
broadcastArray += 7
broadcastArray *= 2

print(broadcastArray)

#Cube every element of the array
#Add 7 to every element of the array
#Multiply every element of the array by 2