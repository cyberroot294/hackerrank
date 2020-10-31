// Attention, delete this line if you do not put this file into a folder with the same name as the folder / package name above

import java.util.Scanner;

/**
 * simpleArraySum https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
public class simpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(simpleArraySum(arr));
        in.close();
    }

    public static int simpleArraySum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
