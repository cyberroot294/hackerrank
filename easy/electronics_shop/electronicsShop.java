import java.util.*;

public class electronicsShop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for (int i = 0; i < n; i++) {
            keyboards[i] = in.nextInt();
        }
        int[] drives = new int[m];
        for (int i = 0; i < m; i++) {
            drives[i] = in.nextInt();
        }

        Arrays.sort(keyboards, Collections.reverseOrder());
        Arrays.sort(drives);

        int res = -1;
        for (int i = 0, j = 0; i < n; i++) { // loop through keyboards Array
            for (; j < m; j++) { // loop through drives Array
                if (keyboards[i] + drives[j] > s) // if pair of keyboard and drive is greater than money, so break the drives for looping
                    break;
                if (keyboards[i] + drives[j] > res) // if pair of keyboard and drive is greater than current result, so change the result to the pair of keyboard and drive
                    res = keyboards[i] + drives[j];
            }
        }
        System.out.println(res);
    }
}