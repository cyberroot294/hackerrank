import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 * appleAndOrange
 */
public class appleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int counter = 0;

        for (int i = 0; i < m; i++) { // looping for apple tree
            int temp = a + in.nextInt();
            counter = temp >= s && temp <= t ? counter += 1 : counter;
        }
        System.out.println(counter);
        counter = 0;
        for (int i = 0; i < n; i++) { // looping for orange tree
            int temp = b + in.nextInt();
            counter = temp >= s && temp <= t ? counter += 1 : counter;
        }
        System.out.println(counter);
    }
}