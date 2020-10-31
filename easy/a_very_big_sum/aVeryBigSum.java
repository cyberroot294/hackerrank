import java.util.*;

/**
 * aVeryBigSum 
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class aVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        aVeryBigSum(arr);
        in.close();
    }

    public static void aVeryBigSum(int[] arr) {
        long sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.print(sum);
    }
}