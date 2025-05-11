
import java.util.Scanner;
public class FriendAgeHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) of friend " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }
        int youngestAge = ages[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
            }
        }
        double tallestHeight = heights[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
            }
        }
        System.out.println("Youngest friend is " + youngestAge + " years old.");
        System.out.println("Tallest friend is " + tallestHeight + " cm tall.");
        scanner.close();
    }
}

