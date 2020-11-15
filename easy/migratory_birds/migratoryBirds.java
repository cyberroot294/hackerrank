import java.util.Scanner;

/**
 * migratoryBirds
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */
public class migratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        migratoryBirds(arr, n);
    }

    public static void migratoryBirds(int[] arr, int n) {
        int[] counter = new int[6];
        for (int i : arr) {
            counter[i]++;
        }
        int max = counter[0];
        int idMax = 0;
        for (int i = 1; i < 6; i++) {
            if (counter[i] == max) {
                if (i < idMax) {
                    max = counter[i];
                    idMax = i;
                }
            } else if (counter[i] > max) {
                idMax = i;
                max = counter[i];
            }
        }

        System.out.println(idMax);
    }
}