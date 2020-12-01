import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem 
 * theHurdleRace
 */

// first, you should find the maximum value of the numbers, and
// find the difference between 'k' and the maximum value,
// and print it 
// you can build program to find the maximum value or just use the Math.max built in function in java
public class theHurdleRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int maxValue = Arrays.stream(arr).max().orElse(0);
        System.out.println(maxValue > k ? maxValue - k : 0);
        in.close();
    }
}