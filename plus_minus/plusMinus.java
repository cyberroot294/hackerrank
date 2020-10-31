import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 * plusMinus
 */
public class plusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        plusMinus(arr, n);
    }

    public static void plusMinus(int[] arr, int n) {
        float positive = 0;
        float negative = 0;
        float zero = 0;

        for (int i : arr) {
            if (i > 0) {
                positive++;
            } else if (i == 0) {
                zero++;
            } else {
                negative++;
            }
        }

        positive = positive / n;
        negative = negative / n;
        zero = zero / n;
        System.out.printf("%.6f\n", positive);
        System.out.printf("%.6f\n", negative);
        System.out.printf("%.6f\n", zero);
    }
}