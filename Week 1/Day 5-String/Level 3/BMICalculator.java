import java.util.Scanner;
public class BMICalculator {
    public static double[][] getInputData(int numPersons) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[numPersons][2];
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }scanner.close();
        return data;
    }
    public static String[][] calculateBMI(double[][] data) {
        String[][] bmiData = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            String status = "";
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }
            bmiData[i][0] = String.format("%.2f", data[i][1]); 
            bmiData[i][1] = String.format("%.2f", data[i][0]); 
            bmiData[i][2] = String.format("%.2f", bmi);        
            bmiData[i][3] = status;                            
        }
        return bmiData;
    }
    public static void displayBMIResults(String[][] bmiData) {
        System.out.println("--------------------------------------------------");
        System.out.println("Person | Height (cm) | Weight (kg) | BMI    | Status");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%-7d | %-12s | %-11s | %-6s | %-15s\n", 
                i + 1, bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
        System.out.println("--------------------------------------------------");
    }
    public static void main(String[] args) {
        int numPersons = 10;
        double[][] personData = getInputData(numPersons);
        String[][] bmiResults = calculateBMI(personData);
        displayBMIResults(bmiResults);
    }
}

