
import java.util.Scanner;
public class CharacterFrequency1 {
    public static char[] uniqueCharacters(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < unique.length(); j++) {
                if (ch == unique.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique += ch;
            }
        }
        return unique.toCharArray();
    }
    public static String[][] characterFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[][] frequencies = characterFrequencies(input);
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " " + frequencies[i][1]);
        }
    scanner.close();}
}

