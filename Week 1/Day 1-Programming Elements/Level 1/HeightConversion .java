import java.util.Scanner;

class HeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();
        double heightInches = heightCm / 2.54;
        int feet = (int) (heightInches / 12);
        int inches = (int) Math.round(heightInches % 12);

        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches);
       
        scanner.close();
    }
}