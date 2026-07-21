import pandas as pd

import random

seriesList = pd.Series([7, 11, 13, 17])

print(seriesList)

print()

seriesList100Value = pd.Series([100, 100, 100, 100, 100])

print(seriesList100Value)

print()

randomNumber0to100Series = pd.Series(random.randint(0, 100) for x in range (1, 21))

print(randomNumber0to100Series)

print()

print(randomNumber0to100Series.describe())

temperatures = pd.Series([98.6, 98.9, 100.2, 97.9], index=["Julie", "Charlie", "Sam", "Andrea"])

print(temperatures)

print()

tempatureDictonary = pd.Series({"Julie": 98.6, "Charlie": 98.9, "Sam": 100.2, "Andrea": 97.9})

print(tempatureDictonary)