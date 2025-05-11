import java.util.Scanner;
class DistanceYard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in feet:");
        double feet = sc.nextDouble();
        double yard = feet / 3;
        double miles = yard / 1760;
        System.out.println("Distance in yard: " + yard);
        System.out.println("Distance in miles: " + miles);
        sc.close();
    }    
}