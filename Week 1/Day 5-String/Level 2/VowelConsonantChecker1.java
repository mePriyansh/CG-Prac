
import java.util.Scanner;
public class VowelConsonantChecker1 {
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static String[][] findVowelsAndConsonants(String str) {
        int length = str.length();
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }
    public static void displayResult(String[][] result) {
        System.out.println("Character | Type");
        System.out.println("-----------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "        | " + result[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String[][] result = findVowelsAndConsonants(input);
        displayResult(result);
   scanner.close();
    }
}

