import java.util.Scanner;
public class SumZero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sum=0;
        while(true){
        System.out.println("Enter the number");
        double num = sc.nextDouble();
        if(num==0){
            System.out.println("Zero entered");
            break;
        }
        sum +=num;
            System.out.println("Number entered is "+num);
            System.out.println("Enter again");
    }
    System.out.println("Sum is "+sum);
        sc.close();
    }
}