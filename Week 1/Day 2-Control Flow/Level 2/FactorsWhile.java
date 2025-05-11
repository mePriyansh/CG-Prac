
import java.util.Scanner;
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        sc.close();
        int i=1;
        while(i<=n){
            if(n%i==0){
                System.out.println(i + " is a factor of " + n);
            }
            i++;
        }
    }
}

