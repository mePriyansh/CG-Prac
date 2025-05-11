import java.util.Scanner;
class IntOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        System.out.println("The value of a+b*c is: "+ (a+b*c));
        System.out.println("The value of a*b+c is: "+ (a*b+c));
        System.out.println("The value of c+a/b is: "+ (c+a/b));
        System.out.println("The value of a%b+c is: "+ (a%b+c));
        sc.close();
    }
}

