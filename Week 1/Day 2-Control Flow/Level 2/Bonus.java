
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the years of service of the employee: ");
        int yearsOfService = scanner.nextInt();
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = (5.0 / 100) * salary;  // 5% bonus
        }
        System.out.printf("The bonus amount for the employee is: %.2f\n", bonus);
        scanner.close();
    }
}

