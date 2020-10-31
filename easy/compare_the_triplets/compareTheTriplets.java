import java.util.Scanner;

/**
 * compareTheTriplets
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class compareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < 3; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            arr2[i] = in.nextInt();
        }
        in.close();
        compareTheTriplets(arr1, arr2);
    }

    public static int[] compareTheTriplets(int[] arr1, int[] arr2) {
        int alice = 0;
        int bob = 0;
        int[] res = new int[2];
        for (int i = 0; i < 3; i++) {
            if (arr1[i] > arr2[i]) {
                alice++;
            } else if (arr2[i] > arr1[i]) {
                bob++;
            }
        }

        res[0] = alice;
        res[1] = bob;
        for (int i : res) {
            System.out.print(i + " ");
        }
        return res;
    }
}