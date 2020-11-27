import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 * salesByMatch
 */
public class salesByMatch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(salesByMatch(n, arr));
        in.close();
    }

    public static int salesByMatch(int n, int[] arr) {
        int res = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i + 1] = 0;
                res++;
            }
        }
        return res;
    }
}