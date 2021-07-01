package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 5, 9, 12, 22, 38, 45 };
        int K = 22;

        int res = binarySearch(arr, K);

        if (res >= 0) {
            System.out.println(K + " found at index: " + res);
        } else {
            System.out.println(K + " not found");
        }
        // 9 found at index: 3
    }

    private static int binarySearch(int[] arr, int K) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < K) {
                low = mid + 1;
            } else if (arr[mid] > K) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
