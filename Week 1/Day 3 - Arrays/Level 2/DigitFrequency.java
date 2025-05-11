
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        if (number < 0) {
            number = -number;
        }
        int[] frequency = new int[10];
        long temp = number;
        while (temp > 0) {
            int digit = (int)(temp % 10);
            frequency[digit]++;
            temp /= 10;
        }
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        sc.close();
    }
}

