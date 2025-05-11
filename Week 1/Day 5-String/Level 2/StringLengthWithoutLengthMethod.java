
import java.util.Scanner;
public class StringLengthWithoutLengthMethod {
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int manualLength = findStringLength(text);
        int builtInLength = text.length();
        System.out.println("Manual Length: " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);
    scanner.close();
    }
}

