
from operator import itemgetter

# I stored the tuples in a list so it's easier to display and iterate through

invoiceTuples: list = [ # the indexes represent the part number, part description, quantity, and price
    (83, "Electric sander", 7, 57.98), 
    (83, "Power saw", 18, 99.99),
    (7, "Sledge hammer", 11, 21.50),
    (77, "Hammer", 76, 11.99),
    (39, "Jig saw", 3, 79.50)
]

# part a 
def sortTupleByPartDescription(invoiceTable):
    print("\n")
    print("part A")
    print("sorting tuples by part description")

    sortedPartDescriptionTable: list = sorted(invoiceTable, key = itemgetter(1)) # the part description is the first index
    print(sortedPartDescriptionTable)

sortTupleByPartDescription(invoiceTuples)

# part b 
def sortTupleByPrice(invoiceTable):
    print("\n")
    print("part B")
    print("sorting tuples by price")

    sortedPriceList: list = sorted(invoiceTable, key = itemgetter(3)) # the price is the third index
    print(sortedPriceList)

sortTupleByPrice(invoiceTuples)

# part c
def mappingAndSortingTuplesByQuantity(invoiceTable):
    print("\n")
    print("part C")
    # we are essentially only using the part description and quantity value elements and omitting the rest
    mapped_invoices: list = list(map(lambda x: (x[1], x[2]), invoiceTable)) # extract just the name d

    mapped_invoices.sort(key = lambda x: x[1]) # sorting by quantity as the quantity will now be the first index
    print(mapped_invoices)
    

mappingAndSortingTuplesByQuantity(invoiceTuples)

#part d / part e
def mappingAndSortingTuplesByValue(invoiceTable):
    print("\n")
    print("part D and E")
    # we are essentially only using the part description and quantity value elements and omitting the rest
    mapped_invoices: list = list(map(lambda x: (x[1], x[3]), filter(lambda x: 200 <= x[0] <= 500, invoiceTable))) # extract just the name d

    # the change with part e should result in the list being empty as there are no values that fit the interval 200 to 500

    mapped_invoices.sort(key = lambda x: x[1]) # sorting by quantity as the quantity will now be the first index
    print(mapped_invoices)
    

mappingAndSortingTuplesByValue(invoiceTuples)

#part f
def sumTotalInvoices(invoiceTable):
    print("\n")
    print("part F")

    totalInvoiceCost: int = 0

    for tuple in invoiceTable:
        invoiceCost: float = tuple[3] # the index for the price in the tuple
        print("the invoice cost is " + str(invoiceCost))
        totalInvoiceCost += invoiceCost
    
    print(str(totalInvoiceCost) + " is the final invoice cost")

sumTotalInvoices(invoiceTuples)