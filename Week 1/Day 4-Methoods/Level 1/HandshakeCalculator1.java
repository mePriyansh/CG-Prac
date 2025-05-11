
import java.util.Scanner;
public class HandshakeCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        int numberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("Number of possible handshakes: " + numberOfHandshakes);
        scanner.close();
    }
}

