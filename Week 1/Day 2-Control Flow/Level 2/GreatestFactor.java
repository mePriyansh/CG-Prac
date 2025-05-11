import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int greatestFactor=1;
        int n = sc.nextInt();
        for(int i=n-1;i>1;i--){
            if(n%i==0){
                greatestFactor=i;
                break;
            }
        }
        System.out.println("The greatest factor of "+n+" is "+greatestFactor);
        sc.close();
    }  
}