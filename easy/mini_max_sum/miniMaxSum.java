import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 * miniMaxSum
 */
public class miniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long min, max, sum;
        min = max = sum = in.nextLong();

        for (int i = 0; i < 4; i++) {
            long temp = in.nextLong();
            sum += temp;
            if (temp < max && temp < min) { // cek apakah nilai nya kecil
                min = temp;
            } else { // assign value jika ternyata nilainya besar
                max = temp;
            }
        }
        in.close();
        System.out.println(sum - max); // print nilai kecil(min)
        System.out.println(sum - min); // print nilai besar(max)
    }
}