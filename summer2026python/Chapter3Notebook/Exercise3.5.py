print('Enter two integers and I will tell you the relationships they satisfy. ')

# read first integer
number1 = int(input('Enter first integer: '))
 
# read second integer
number2 = int(input('Enter second integer: '))

if number1 == number2:
    print('the two numbers are equal')
else:
    print('the two numbers are not equal')

if number1 > number2:
    print('number 1 is greater than number 2')
elif number1 < number2:
    print('number 1 is less than number2')

if number1 <= number2:
    print('number1 is less than or equal to number2 ')
elif number1 >= number2:
    print('number1 is greater than or equal to number 2')