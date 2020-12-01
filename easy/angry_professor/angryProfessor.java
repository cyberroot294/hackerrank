import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-professor/problem
 * angryProfessor
 */
public class angryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int late = 0;
            int notLate = 0;
            for (int j = 0; j < n; j++) {
                int temp = in.nextInt();
                if (temp > 0)
                    late++;
                else
                    notLate++;
            }

            if (notLate >= k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}