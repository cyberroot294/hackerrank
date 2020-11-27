import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 * catsAndAMouse
 */
public class catsAndAMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nCases = in.nextInt();
        int[][] arr = new int[nCases][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        catsAndAMouse(arr);
        in.close();
    }

    public static void catsAndAMouse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int catA = Math.abs(arr[i][2] - arr[i][0]);
            int catB = Math.abs(arr[i][2] - arr[i][1]);
            if (catA < catB)
                System.out.println("Cat A");
            else if (catB < catA)
                System.out.println("Cat B");
            else
                System.out.println("Mouse C");
        }
    }
}