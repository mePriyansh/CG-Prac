import java.util.Scanner;
public class NumberChecker {
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
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max) {
                secondMax = max;
                max = digit;
            } else if (digit > secondMax && digit != max) {
                secondMax = digit;
            }
        }
        return new int[]{max, secondMax};
    }
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < min) {
                secondMin = min;
                min = digit;
            } else if (digit < secondMin && digit != min) {
                secondMin = digit;
            }
        }
        return new int[]{min, secondMin};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        int[] digits = extractDigits(number);
        boolean isDuck = isDuckNumber(digits);
        boolean isArmstrong = isArmstrongNumber(number, digits);
        int[] largestTwo = findLargestAndSecondLargest(digits);
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("\nDigit Count: " + digitCount);
        System.out.println("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println("\nIs Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest Digit: " + largestTwo[0]);
        System.out.println("Second Largest Digit: " + (largestTwo[1] == Integer.MIN_VALUE ? "None" : largestTwo[1]));
        System.out.println("Smallest Digit: " + smallestTwo[0]);
        System.out.println("Second Smallest Digit: " + (smallestTwo[1] == Integer.MAX_VALUE ? "None" : smallestTwo[1]));
    scanner.close();
    }

}

