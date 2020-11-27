import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 * countingValleys
 */
public class countingValleys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(in.nextLine());
        String string = in.nextLine();

        int seaLevel = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (string.charAt(i) == 'D')
                seaLevel--;
            else
                seaLevel++;
            if (seaLevel == 0 && string.charAt(i) == 'U')
                res++;
        }
        System.out.println(res);
        in.close();
    }
}