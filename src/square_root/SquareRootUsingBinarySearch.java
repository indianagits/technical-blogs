package src.square_root;

public class SquareRootUsingBinarySearch {
    private static double PRECISION = 0.000001;

    public static void main(String[] args) {
        double X = 13;

        double R = sqrt(X);

        System.out.println("The square root of " + X + " is " + withPrecision(R));
    }

    private static double sqrt(double X) {
        for (int i = 1; i < X; ++i) {
            int p = i * i;
            if (p == X) {
                // perfect square
                return i;
            }
            if (p > X) {
                // found left part of decimal
                return sqrt(X, i - 1, i);
            }
        }
        return Double.NaN;
    }

    private static double sqrt(double X, double low, double high) {
        double mid = (low + high) / 2;
        double p = mid * mid;
        // uncomment below line to see how we reach the final answer
        // System.out.println(mid);

        if (p == X || (Math.abs(X - p) < PRECISION)) {
            return mid;
        }
        if (p < X) {
            return sqrt(X, mid, high);
        }
        return sqrt(X, low, mid);
    }

    private static double withPrecision(double a) {
        return Math.round(a * 1000000d) / 1000000d;
    }
}
