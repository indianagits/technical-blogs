package sort;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 6, 9, 2, 10, 8, 6, 4, 1, 5, 9, 4, 6, 9, 6, 1 };

        System.out.print("Original array: ");
        print(arr);

        countingSort(arr);

        System.out.print("Sorted array: ");
        print(arr);
    }

    private static int maximum(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    private static void countingSort(int[] arr) {
        int n = arr.length;
        int max = maximum(arr);

        int[] count = new int[max + 1];
        for (int i = 0; i < n; ++i) {
            count[arr[i]]++;
        }

        int lastIndex = 0;
        for (int i = 0; i <= max; ++i) {
            while (count[i]-- > 0) {
                arr[lastIndex++] = i;
            }
        }
    }

    private static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
