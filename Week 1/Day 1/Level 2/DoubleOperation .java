import java.util.Scanner;
 class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double a =sc.nextDouble();
        double b =sc.nextDouble();
        double c =sc.nextDouble();
        System.out.println("The value of a+b*c is: "+ (a+b*c));
        System.out.println("The value of a*b+c is: "+ (a*b+c));
        System.out.println("The value of c+a/b is: "+ (c+a/b));
        System.out.println("The value of a%b+c is: "+ (a%b+c));
        sc.close();
    }
}