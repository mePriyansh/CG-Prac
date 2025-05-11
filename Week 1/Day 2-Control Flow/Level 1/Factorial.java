
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        System.out.println("Factorial is: "+fact);
    }
}

