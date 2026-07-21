import pandas as pd

temperatureDictonary = {"Maxine": [100.2, 100.4, 98.9], "James": [97.9, 98.1, 98.4], "Andrea": [98.6, 98.7, 99.0]}
temperaturesDataFrame = pd.DataFrame(temperatureDictonary)

print(temperaturesDataFrame)

print()

customTemperatureDataFrame = pd.DataFrame(temperatureDictonary, index=["Morning", "Afternoon", "Evening"])

print(customTemperatureDataFrame)

print()

MaxineTemperatures = temperaturesDataFrame["Maxine"]

print(MaxineTemperatures)

print()

MorningTemperatures = customTemperatureDataFrame.loc["Morning"]

print(MorningTemperatures)

print()

MorningAndEveningTemperatures = customTemperatureDataFrame.loc[["Morning", "Evening"]]
print(MorningAndEveningTemperatures)

print()

AmandaAndMaxineTemperatures = temperaturesDataFrame[["Maxine", "Andrea"]]

print(AmandaAndMaxineTemperatures)

print()

MorningAndAfternoonAmandaAndMaxineTemperatures = customTemperatureDataFrame.loc[["Morning", "Evening"]][["Maxine", "Andrea"]]

print(MorningAndAfternoonAmandaAndMaxineTemperatures)

print()

temperaturesDataFrameStatistics = temperaturesDataFrame.describe()
print(temperaturesDataFrameStatistics)

print()

transposedTemperatureDataFrame = temperaturesDataFrame.transpose()
print(transposedTemperatureDataFrame)

print()

sortedTemperatureDataFrame = temperaturesDataFrame.sort_index(axis=1)
print(sortedTemperatureDataFrame)