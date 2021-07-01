package search;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 6, 8, 10, 13, 16, 18 };
        int K = 13;

        int res = interpolationSearch(arr, K);

        if (res >= 0) {
            System.out.println(K + " found at index: " + res);
        } else {
            System.out.println(K + " not found");
        }
        // 13 found at index: 5
    }

    private static int interpolationSearch(int[] arr, int K) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high && K >= arr[low] && K <= arr[high]) {
            int index = low + ((K - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[index] < K) {
                low = index + 1;
            } else if (arr[index] > K) {
                high = index - 1;
            } else {
                return index;
            }
        }

        return -1;
    }
}
