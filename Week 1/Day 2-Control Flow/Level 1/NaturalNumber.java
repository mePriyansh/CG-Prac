import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum=0;
        if(number<0){
            System.out.println("The number "+ number + "is not a natural number");
        }
        else{
            sum=number*(number+1)/2;
            System.out.println("The sum of "+ number + " natural numbers is: "+ sum);
        }
        input.close();
    }
}

