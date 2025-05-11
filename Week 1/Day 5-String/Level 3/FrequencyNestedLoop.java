
import java.util.Scanner;
public class FrequencyNestedLoop {
    public static String[] findCharFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }
        return result;
    }
    public static void display(String[] data) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String s : data) {
            String[] parts = s.split(" : ");
            System.out.printf("    %s     |     %s\n", parts[0], parts[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] frequencyData = findCharFrequency(text);
        display(frequencyData);
   scanner.close();
    }
}

