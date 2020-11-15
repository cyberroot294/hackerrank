import java.util.Scanner;

/**
 * divisibleSumPairs
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
public class divisibleSumPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        in.close();

        divisibleSumPairs(k, arr);
    }

    public static void divisibleSumPairs(int k, int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int temp = arr[i] + arr[j];
                if (temp % k == 0) {
                    counter++;
                }

            }

        }

        System.out.println(counter);
    }
}