import sys


def countingSort(arr):
    max = maximum(arr)

    count = [0] * (max + 1)
    for e in arr:
        count[e] += 1

    lastIndex = 0
    for i in range(0, max+1):
        while count[i] > 0:
            arr[lastIndex] = i
            lastIndex += 1
            count[i] -= 1


def maximum(arr):
    res = -sys.maxsize-1

    for e in arr:
        res = max(res, e)

    return res


def printArray(arr):
    for e in arr:
        print(e, end=" ")

    print()


arr = [6, 9, 2, 10, 8, 6, 4, 1, 5, 9, 4, 6, 9, 6, 1]
print("Original array: ", end=" ")
printArray(arr)

countingSort(arr)

print("Sorted array: ", end=" ")
printArray(arr)
