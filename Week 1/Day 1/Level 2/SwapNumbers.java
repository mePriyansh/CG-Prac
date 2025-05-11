import java.util.Scanner;
class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + " and b = " + b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("After swapping: a = " + a + " and b = " + b);
        sc.close();
    }    
}