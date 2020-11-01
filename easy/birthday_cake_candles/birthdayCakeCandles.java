import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 * birthdayCakeCandles
 */
public class birthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // panjang array / banyak elemen
        int max = in.nextInt(); // asumsi nilai max ialah elemen pertama dari array
        int counter = 0; // variabel untuk menampung nilai max yang sama
        for (int i = 0; i < n - 1; i++) {
            int temp = in.nextInt();
            if (temp > max) {
                max = temp;
                counter = 0;
            } else if (temp == max) {
                counter++;
            }
        }
        System.out.print(counter + 1); // ditambah dengan 1 karna nilai awal max belom dihitung ke counter
        in.close();
    }
}