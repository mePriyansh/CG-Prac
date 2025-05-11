import java.util.Scanner;
class UserFeeDiscount {
    public static void main(String[] args) {
        int fee, discountPercent, totalFee;
        double discount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fee: ");
        fee = sc.nextInt();
        System.out.println("Enter the discount: ");
        discountPercent = sc.nextInt();
        discount = (fee * discountPercent) / 100;
        totalFee = fee - (int)discount;
        System.out.println("Total discount is INR " + discount + " and final discounted fee is INR " + totalFee);
        sc.close();
    }    
}
