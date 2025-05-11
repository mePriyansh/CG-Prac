
import java.util.Scanner;
public class StringSplitComparison {
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
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scanner.nextLine();
        String[] customSplitWords = customSplit(text);
        String[] splitWords = text.split(" ");
        boolean areArraysEqual = compareArrays(customSplitWords, splitWords);
        System.out.println("Custom Split: ");
        for (String word : customSplitWords) {
            System.out.println(word);
        }
        System.out.println("Built-in Split: ");
        for (String word : splitWords) {
            System.out.println(word);
        }
        System.out.println("Are both arrays equal? " + areArraysEqual);
    scanner.close();}
}

