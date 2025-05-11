
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number(till 100): ");
        int n= sc.nextInt();
        sc.close();
        for(int i=100;i>=1;i--){
            if(i%n==0){
                System.out.println(i + " is a multiple of "+ n);
            }
            continue;
        }

    }
}

