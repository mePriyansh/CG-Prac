import java.util.Scanner;
public class WordLengthArray {
    public static String[] customSplit(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIndex = 0;
        int wordIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndexInArray = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[wordIndexInArray++] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordIndexInArray] = text.substring(start);
        return words;
    }
    public static String convertLengthToString(int length) {
        return String.valueOf(length);
    }
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = convertLengthToString(words[i].length());
        }
        return result;
    }
    public static void displayResults(String[][] wordLengthArray) {
        System.out.println("Word\t\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t\t" + Integer.parseInt(wordLengthArray[i][1]));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();
        String[] words = customSplit(text);
        String[][] wordLengthArray = getWordsAndLengths(words);
        displayResults(wordLengthArray);
    scanner.close();
    }
}

