
import java.util.Scanner;
public class Countdownfor {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();
    for(int i=number;i>0;i--){
        System.out.println(i);
    }
}
}

