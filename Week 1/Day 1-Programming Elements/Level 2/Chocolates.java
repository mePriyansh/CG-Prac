import java.util.Scanner;
public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chocolates: ");
        int numberOfchocolates = sc.nextInt();
        System.out.println("Enter the number of students: ");
        int numberOfstudents = sc.nextInt();
        int chocos =numberOfchocolates/numberOfstudents;
        int remaining =numberOfchocolates%numberOfstudents;
        System.out.println("The number of chocolates each child gets is  "+chocos+" and the number of remaining chocolates are "+remaining);      sc.close();
    }
}