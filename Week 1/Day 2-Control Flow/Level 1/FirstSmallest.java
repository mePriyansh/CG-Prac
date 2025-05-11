import java.util.Scanner;
public class FirstSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter three numbers: ");
        n1=input.nextInt();
        n2=input.nextInt();
        n3=input.nextInt();
        if(n1<=n2 && n1<=n3){
            System.out.print("Is the first number the smallest?"+ true);
        }
        else {
            System.out.println("Is the first number the smallest? "+false);
        }
        input.close();
    }
}

