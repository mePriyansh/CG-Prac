
import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        sc.close();
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }
        String[] result = new String[number + 1];
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                result[i] = "Buzz";
            } else {
                result[i] = Integer.toString(i);
            }
        }
        System.out.println("\nFizzBuzz Results:");
        for (int i = 1; i < result.length; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}

