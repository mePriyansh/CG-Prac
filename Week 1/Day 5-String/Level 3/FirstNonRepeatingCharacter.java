
import java.util.Scanner;
public class FirstNonRepeatingCharacter {
    public static char getFirstNonRepeatingChar(String text) {
        int[] freq = new int[256];
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break;
            }
        }
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (freq[ch] == 1) {
                    return ch;
                }
            } catch (Exception e) {
                break;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        char result = getFirstNonRepeatingChar(text);
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    scanner.close();}
} 

