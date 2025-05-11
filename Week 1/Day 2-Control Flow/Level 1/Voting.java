import java.util.Scanner;
public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("The person is "+age+" and can vote.");
        }
        else{
            System.out.println("The person is "+age+" and cannot vote.");
        }
        input.close();
    }
}

