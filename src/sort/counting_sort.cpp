#include <stdio.h>
#include <limits.h>
using namespace std;

void print(int arr[], int n)
{
    for (int i = 0; i < n; ++i)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int maximum(int a, int b)
{
    return a >= b ? a : b;
}

int maximum(int arr[], int n)
{
    int max = INT_MIN;

    for (int i = 0; i < n; ++i)
    {
        max = maximum(max, arr[i]);
    }

    return max;
}

void countingSort(int arr[], int n)
{
    int max = maximum(arr, n);

    int count[max + 1];
    for (int i = 0; i <= max; ++i)
    {
        count[i] = 0;
    }

    for (int i = 0; i < n; ++i)
    {
        count[arr[i]]++;
    }

    int lastIndex = 0;
    for (int i = 0; i <= max; ++i)
    {
        while (count[i]--)
        {
            arr[lastIndex++] = i;
        }
    }
}

int main()
{
    int arr[] = {6, 9, 2, 10, 8, 6, 4, 1, 5, 9, 4, 6, 9, 6, 1};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Original array: ");
    print(arr, n);

    countingSort(arr, n);

    printf("Sorted array: ");
    print(arr, n);

    return 0;
}