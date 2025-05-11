
import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;
        int originalNumber = number; // Store original number for display
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10; 
                count++;     
            }
        }
        System.out.println("The number " + originalNumber + " has " + count + " digits.");
        
        scanner.close();
    }
}

