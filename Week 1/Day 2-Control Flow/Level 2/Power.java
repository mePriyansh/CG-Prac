import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        int result = 1;
        for(int i=1; i<=power; i++){
            result = result*num;
        }
        System.out.println("The result is: "+result);
        sc.close();
    }
}