package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 3, 12, 9, 45, 1, 22 };
        int K = 9;

        int res = linearSearch(arr, K);

        if (res >= 0) {
            System.out.println(K + " found at index: " + res);
        } else {
            System.out.println(K + " not found");
        }
        // 9 found at index: 3
    }

    private static int linearSearch(int[] arr, int K) {
        int n = arr.length;

        for (int i = 0; i < n; ++i) {
            if (arr[i] == K) {
                return i;
            }
        }

        return -1;
    }
}
