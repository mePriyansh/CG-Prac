
import java.util.Scanner;
public class UniqueCharacters {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static char[] getUniqueCharacters(String text) {
        int len = getLength(text);
        char[] result = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[count++] = current;
            }
        }
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) {
            uniqueChars[i] = result[i];
        }
        return uniqueChars;
    }
    public static void displayArray(char[] arr) {
        System.out.print("Unique characters: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        char[] unique = getUniqueCharacters(text);
        displayArray(unique);
    scanner.close();
    }
}

