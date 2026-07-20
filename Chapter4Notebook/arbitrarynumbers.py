def product(*args):
    total = 1 # use 1 as anything multiplied against 1 keeps the product the same
    for arg in {*args}: 
        total *= arg

    print(str(total) + " is the total product")

product(2, 4, 6)