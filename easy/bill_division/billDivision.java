import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 * billDivision
 */
public class billDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int didNotEat = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int charged = in.nextInt();
        billDivision(didNotEat, arr, charged);
        in.close();
    }

    public static void billDivision(int didNotEat, int[] arr, int charged) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (i == didNotEat)
                continue;
            else
                sum += arr[i];
        int trueCharged = sum / 2;
        if (charged != trueCharged)
            System.out.println(charged - trueCharged);
        else
            System.out.print("Bon Appetit");
    }
}