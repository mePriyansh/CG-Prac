
import java.util.Scanner;
public class PalindromeChecker {
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeLogic2(text, start + 1, end - 1);
    }
    public static char[] reverseCharArray(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }
    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseCharArray(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean result1 = isPalindromeLogic1(input);
        boolean result2 = isPalindromeLogic2(input, 0, input.length() - 1);
        boolean result3 = isPalindromeLogic3(input);
        System.out.println("Logic 1: " + result1);
        System.out.println("Logic 2: " + result2);
        System.out.println("Logic 3: " + result3);
    scanner.close();}
}

