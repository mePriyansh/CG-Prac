
import java.util.Scanner;
public class YoungShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the three persons: ");
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        int age3 = sc.nextInt();
        System.out.println("Enter the height of three persons: ");
        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int height3 = sc.nextInt();
        sc.close();
        if(age1<age2 && age2<age3){
            System.out.println("The youngest person is:"+age1);
        }
        else if(age2<age1 && age2<age3){
            System.out.println("The youngest person is:"+age2);
        }
        else{
            System.out.println("The youngest person is:"+age3);
        }
        if(height1>height2 && height2>height3){
            System.out.println("The tallest person is:"+height1);
        }
        else if(height2>height1 && height2>height3){
            System.out.println("The tallest person is:"+height2);
        }
        else{
            System.out.println("The tallest person is:"+height3);
        }
    }
}

