import java.util.Scanner;
class PriceofItems {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter unit price:");
        int unitPrice= sc.nextInt();
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        int totalPrice = unitPrice*quantity;
        System.out.println("The total purchase price is INR "+ totalPrice+ " if the quantity " + quantity + " and unit price is INR " + unitPrice );
        sc.close();
    }
}