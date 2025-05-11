
import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker2 {
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
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }
    public static boolean isPalindrome(int number) {
        int[] digits = extractDigits(number);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        int[] digits = extractDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        boolean isPal = isPalindrome(number);
        boolean isDuck = isDuckNumber(digits);

        System.out.println("\nNumber of digits: " + digitCount);
        System.out.println("Original digits: " + Arrays.toString(digits));
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));
        System.out.println("Is Palindrome: " + isPal);
        System.out.println("Is Duck Number: " + isDuck);
    scanner.close();
    }
}

