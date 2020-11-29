import java.util.*;

/**
 * 
 * designerPdfViewer
 */
public class designerPdfViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = in.nextInt();
        }
        String str = in.next();

        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int temp = arr[str.charAt(i) - 97];
            if (temp > max)
                max = temp;
        }

        int res = max * str.length();
        System.out.print(res);
        in.close();
    }
}