startCelsiusTemp: int = 1
endNumber: int = 101 # it goes to 100 degrees

def fahrenheitConversion():
    for celsiusTemperature in range(startCelsiusTemp, endNumber):
        fahrenheitTemperature: float = round((9/5) * celsiusTemperature + 32, 1)
        print(f'{celsiusTemperature} | \t', "The fahrenheit temperature of " + str(celsiusTemperature) + " degrees" + " is " + str(fahrenheitTemperature) + " degrees." + "\n")
        

fahrenheitConversion()