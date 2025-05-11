import java.util.Scanner;
public class CountdownWhile {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();
    while(number>0){
        System.out.println(number);
        number--;
    }
}
}