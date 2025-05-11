import java.util.Scanner;

public class MultipleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (positive integer less than 100): ");
        int number = scanner.nextInt();
            int counter = number - 1;
            while (counter > 0) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        scanner.close();
    }
}