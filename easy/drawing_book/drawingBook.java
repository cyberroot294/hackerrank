import java.util.Scanner;

/**
 * drawingBook
 */
public class drawingBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        System.out.println(drawingBook(n, p));
        in.close();
    }

    public static int drawingBook(int n, int p) {
        int startAtBeginning = p / 2;
        int startAtEnd = (n / 2) - (p / 2);
        return startAtBeginning < startAtEnd ? startAtBeginning : startAtEnd;
    }
}