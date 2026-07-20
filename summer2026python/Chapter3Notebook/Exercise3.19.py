#Determine all pythagorean triples for all integers <= 20
# Use a triple nested for loop
#Highest for loop { for i range in (1, 21 } loop 20 times (index = a)
#Middle loop should get the current index and the index ahead ( index = b)
#Inner loop should get the end index ( index = c)
#The loops shpuld all occur simulatenously

limit = 21 # use one ahead because you need to loop up to 20

for a in range (1, limit): # print from 0 to 20
    for b in range(a, limit):
        for c in range(b, limit):
            if (a**2 + b**2) == (c ** 2): # pythagorean theorem
                print(a, b, c, " is a pythagorean triple")