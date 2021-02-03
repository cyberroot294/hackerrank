import java.util.Scanner;

/**
 * theBirthdayBar
 */
public class theBirthdayBar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int res = solve(arr, n, d, m);
        System.out.println(res);
        int res2 = solveWithRecursion(arr, n, d, m);
        System.out.println(res2);
        in.close();
    }

    private static int solve(int[] arr, int n, int d, int m) {
        // check if possible to sum
        if (m > n)
            return 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int limit = i + m;
            // check if possible to sum
            if (limit > n)
                break;

            int sum = 0;
            // loop through the array, and sum it
            for (int j = i; j < limit; j++)
                sum += arr[j];
            // check if sum equals to birth day
            if (sum == d)
                counter++;
        }
        return counter;
    }

    private static int solveWithRecursion(int[] arr, int n, int d, int m) {
        return solveWithRecursion(arr, n, d, m, 0);
    }

    private static int solveWithRecursion(int[] arr, int n, int d, int m, int i) {
        int limit = i + m;
        if (limit > n) // base case
            return 0;
        int sum = 0;
        // loop through the array, and sum it
        for (int j = i; j < limit; j++)
            sum += arr[j];
        // check if sum equals to birth day
        int equalsToBirthday = sum == d ? 1 : 0;
        return equalsToBirthday + solveWithRecursion(arr, n, d, m, ++i); // recursive case
    }
}