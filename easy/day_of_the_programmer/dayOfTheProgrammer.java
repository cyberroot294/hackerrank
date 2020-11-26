import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 * dayOfTheProgrammer
 */
public class dayOfTheProgrammer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println(dayOfTheProgrammer(year));
        in.close();
    }

    public static String dayOfTheProgrammer(int year) {
        if (year == 1918)
            // 32nd day of 1918 in Russia is 14th February, 
            // so sum day before september is 31 + (28-13) + 31 + 30 + 31 + 30 + 31 + 31 = 230
            return String.format("%d.%s.%d", 256 - 230, "09", year);
        else if (year < 1918) {
            if (year % 4 == 0) // leap year, 
                // so sum day before september is 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 = 244.
                return String.format("%d.%s.%d", 256 - 244, "09", year);
            // not a leap year, 
            // so sum day before september is 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 = 243.
            return String.format("%d.%s.%d", 256 - 243, "09", year);
        }
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) // leap year, 
            // so sum day before september is 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 = 244.
            return String.format("%d.%s.%d", 256 - 244, "09", year);
        // not a leap year, 
        // so sum day before september is 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 = 243.
        return String.format("%d.%s.%d", 256 - 243, "09", year);
    }
}