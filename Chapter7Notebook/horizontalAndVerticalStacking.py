import numpy as np

array1 = np.array([[0, 1], [2, 3]])
array2 = np.array([[4, 5], [6, 7]])

array3 = np.vstack((array1, array2)).reshape(4,2)

print(array3)

print()

array4 = np.hstack((array1, array2)).reshape(2,4)

print(array4)

print()

array5 = np.vstack((array4, array4)).reshape(4,4)

print(array5)

print()

array6 = np.hstack((array3, array3)).reshape(4,4)

print(array6)