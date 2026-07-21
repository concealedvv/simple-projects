import numpy as np

powerTwoPowerArray = np.array([2 ** index for index in range(0, 6)]).reshape(2,3)

flattenedArray = powerTwoPowerArray.flatten()

print(powerTwoPowerArray)

print() # separates with new line so it's more readable

print(flattenedArray)

ravelArray = powerTwoPowerArray.ravel()

print(powerTwoPowerArray)

print() # separates with new line so it's more readable

print(ravelArray)