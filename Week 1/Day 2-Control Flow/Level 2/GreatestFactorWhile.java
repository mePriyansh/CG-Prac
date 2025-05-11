import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int greatestFactor=1;
        int n = sc.nextInt();
        int counter=n-1;
        while(counter>1){
            if(n%counter==0){
                greatestFactor=counter;
                break;
            }
            counter--;
        }
        System.out.println("The greatest factor of "+n+" is "+greatestFactor);
        sc.close();
    }  
}
