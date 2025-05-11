
import java.util.Random;
public class ZaraBonus {
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            double salary = 10000 + (random.nextDouble() * (99999 - 10000));
            int yearsOfService = 1 + random.nextInt(15);
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }   
        return employeeData;
    }
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];
        
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;
            if (yearsOfService > 5) {
                bonus = 0.05 * oldSalary;
            } else {
                bonus = 0.02 * oldSalary;
            }
            double newSalary = oldSalary + bonus;
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }
    public static void calculateAndDisplayTotal(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        System.out.println("Employee Data (Tabular Format):");
        System.out.printf("| %-10s | %-10s | %-10s | %-10s |\n", "Employee", "Old Salary", "New Salary", "Bonus");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < updatedData.length; i++) {
            double oldSalary = updatedData[i][0];
            double newSalary = updatedData[i][1];
            double bonus = updatedData[i][2];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            System.out.printf("| %-10d | %-10.2f | %-10.2f | %-10.2f |\n", i + 1, oldSalary, newSalary, bonus);
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
    }
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        calculateAndDisplayTotal(updatedData);
    }
}

