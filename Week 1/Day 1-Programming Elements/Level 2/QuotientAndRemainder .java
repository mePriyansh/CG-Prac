import java.util.Scanner;
class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = sc.nextInt();
        System.out.println("Enter second number:");
        int second = sc.nextInt();
        int quotient = first / second;
        int remainder = first % second;
        System.out.println("The quotient is "+ quotient + "  and the remainder is "+ remainder + "  of two numbers"+ first + " and "+ second);
        sc.close();
    }    
}