#Create a nested for loop
#Outside loop is a for ___ in range(11) to loop 10 times
#Inside loop is to manage the amount of stars

for index in range(1): # this is triangle a (use 1 because you only need to print once)
    
    for index in range(1, 11, 1):
        print('*' * index, end='\n')

print('\n' + '-' * 80) # pseudo separator

for index in range(1): # this is triangle b (use 1 because you only need to print once)
    
    for index in range(11, 0, -1):
        print('*' * index, end='\n')

print('\n' + '-' * 80) # pseudo separator

for index in range(1): # this is triangle c (use 1 because you only need to print once)
    
    for index in range(11, 0, -1):
        print(' ' * (11 - index) + '*' * index)

print('\n' + '-' * 80) # pseudo separator

for index in range(1): # this is triangle d (use 1 because you only need to print once)
    
    for index in range(11, 0, -1):
        print(' ' * index + '*' * (11 - index), end='\n')