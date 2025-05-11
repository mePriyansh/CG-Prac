import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (year < 1582) {
            System.out.println("The LeapYear program only works for year >= 1582.");
        } else {
            if (isLeapYear(year)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is Not a Leap Year.");
            }
        }
        scanner.close();
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

