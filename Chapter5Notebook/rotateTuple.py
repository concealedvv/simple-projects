
def rotate(a, b, c):
    return (c, a, b) #  first argument = index 1, second argument = index 2, third argument = index 0.

for i in range(0, 3):
    a, b, c = rotate("Doug", 22, 1984)
    print(a, b, c)