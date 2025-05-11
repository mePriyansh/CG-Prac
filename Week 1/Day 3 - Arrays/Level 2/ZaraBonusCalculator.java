
import java.util.Scanner;
public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            double s = scanner.nextDouble();
            if (s <= 0) {
                System.out.println("Invalid salary. Please enter again.");
                i--;
                continue;
            }
            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            double y = scanner.nextDouble();
            if (y < 0) {
                System.out.println("Invalid years of service. Please enter again.");
                i--;
                continue;
            }
            salary[i] = s;
            yearsOfService[i] = y;
        }
        for (int i = 0; i < 10; i++) {
            double rate = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonus[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.printf("Total bonus payout: %.2f\n", totalBonus);
        System.out.printf("Total old salary: %.2f\n", totalOldSalary);
        System.out.printf("Total new salary: %.2f\n", totalNewSalary);
    scanner.close();
    }
}

