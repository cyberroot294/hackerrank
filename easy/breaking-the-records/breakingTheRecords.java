import java.util.Scanner;

/**
 * breakingTheRecords
 */
public class breakingTheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        breakingTheRecords(arr);
    }

    public static void breakingTheRecords(int[] arr) {
        int highestScore = arr[0]; // assume the highest score
        int lowestScore = arr[0]; // assume the lowest score
        int breakTheHighest = 0;
        int breakTheLowest = 0;
        for (int i : arr) {
            if (i > highestScore) {
                breakTheHighest++;
                highestScore = i;
            } else if (i < lowestScore) {
                breakTheLowest++;
                lowestScore = i;
            }
        }
        System.out.printf("%d %d", breakTheHighest, breakTheLowest);
    }
}