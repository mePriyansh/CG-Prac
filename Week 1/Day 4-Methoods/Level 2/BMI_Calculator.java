import java.util.Scanner;
public class BMI_Calculator {
    public static double calculateBMI(double weight, double height) {
        height = height / 100;
        return weight / (height * height);
    }
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] bmiStatus = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            bmiStatus[i] = getBMIStatus(data[i][2]);
        }
        System.out.println("\nBMI Calculation and Status for 10 Persons:");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI | Status");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " | " + data[i][0] + " | " + data[i][1] + " | " + String.format("%.2f", data[i][2]) + " | " + bmiStatus[i]);
        }
        scanner.close();
    }
}

