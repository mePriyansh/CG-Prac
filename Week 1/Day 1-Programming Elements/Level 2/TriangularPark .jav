import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the lengths of the sides of the triangular park (in meters):");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5000;
        int rounds = (int) (distanceToRun / perimeter);
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
        scanner.close();
    }
}

