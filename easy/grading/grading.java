import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/grading/problem
 * grading
 */
public class grading {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            temp = (temp < 38) ? temp : temp % 5 > 2 ? temp + (5 - (temp % 5)) : temp;
            System.out.println(temp);
        }
        in.close();
    }
}