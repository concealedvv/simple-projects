import numpy as np

broadcastArray = np.arange(4).reshape(2,2) # creates a 2x2 array with the elements being between 0-3

broadcastArray **= 3
broadcastArray += 7
broadcastArray *= 2

print(broadcastArray)