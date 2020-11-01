import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 * timeConversion
 */
public class timeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String timeInAMPM = in.next();
        int hour = (Integer.parseInt(timeInAMPM.substring(0, 2)) % 12);
        if (timeInAMPM.contains("PM")) {
            hour += 12;
        }
        String hourStr = hour < 10 ? "0" + Integer.toString(hour) : Integer.toString(hour);
        System.out.printf("%s%s", hourStr, timeInAMPM.substring(2, 8));
        in.close();
    }
}