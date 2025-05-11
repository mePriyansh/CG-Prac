
import java.util.Scanner;
public class CharacterFrequency {
    public static String[][] getCharFrequencies(String text) {
        int[] freq = new int[256];
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break;
            }
        }
        boolean[] visited = new boolean[256];
        int count = 0;
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (!visited[ch]) {
                    visited[ch] = true;
                    count++;
                }
            } catch (Exception e) {
                break;
            }
        }
        String[][] result = new String[count][2];
        visited = new boolean[256];
        int index = 0;
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                if (!visited[ch]) {
                    visited[ch] = true;
                    result[index][0] = String.valueOf(ch);
                    result[index][1] = String.valueOf(freq[ch]);
                    index++;
                }
            } catch (Exception e) {
                break;
            }
        }
        return result;
    }
    public static void displayTable(String[][] data) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("    %s     |     %s\n", data[i][0], data[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        String[][] frequencies = getCharFrequencies(text);
        displayTable(frequencies);
    scanner.close();
    }
}

