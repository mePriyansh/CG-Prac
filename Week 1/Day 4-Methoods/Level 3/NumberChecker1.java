
import java.util.Scanner;
public class NumberChecker1 {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    public static int[] extractDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }
        int[][] freqArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freqArray[i][0] = i;
            freqArray[i][1] = freq[i];
        }
        return freqArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        int[] digits = extractDigits(number);
        int digitSum = sumOfDigits(digits);
        int squaresSum = sumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, digits);
        int[][] freq = digitFrequency(digits);
        System.out.println("\nNumber of digits: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println("\nSum of digits: " + digitSum);
        System.out.println("Sum of squares of digits: " + squaresSum);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " appears " + freq[i][1] + " times");
            }
        }
        scanner.close();
    }
}

