import java.util.Scanner;
public class VowelConsonantCounter {
    public static String checkCharacter(char ch) {
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
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (checkCharacter(ch).equals("Vowel")) {
                vowels++;
            } else if (checkCharacter(ch).equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        int[] result = countVowelsAndConsonants(input);
        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);
    scanner.close();}
}

