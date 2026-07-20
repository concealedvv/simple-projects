# initalize variables
passes = 0
failures = 0
# process 10 students

for student in range(10):
 selectedCorrectNumber = False

 while selectedCorrectNumber == False:

    result = int(input('Enter result (1=pass, 2=fail): '))
    if result != 1 and result != 2:
      print("not the number")
      result = int(input('Enter result (1=pass, 2=fail): ')) # use


    elif result == 1 or result == 2:
      selectedCorrectNumber = True
      print('found number')
    if result == 1:
      passes += 1
      print('you passed')
      
      #print("stopped loop")
    elif result == 2:
      failures += 1
      print('you failed')
      #print("stopped loop")


if passes >= 8:
    print('Bonus to professor')