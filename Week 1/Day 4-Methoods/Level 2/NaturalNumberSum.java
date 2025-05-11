import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        scanner.close();
        if (n <= 0) {
            System.out.println("Input must be a natural number (positive integer).");
            return;
        }
        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result. The computation is correct.");
        } else {
            System.out.println("There is a mismatch in the results.");
        }
        
    }
    public static int sumUsingRecursion(int n) {
        if (n == 1)
            return 1;
        return n + sumUsingRecursion(n - 1);
    }
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}

