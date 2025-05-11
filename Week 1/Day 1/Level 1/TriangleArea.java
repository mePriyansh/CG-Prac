import java.util.Scanner;
class TriangleArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base,height;
        System.out.println("Enter the base of the triangle: ");
        base = sc.nextInt();
        System.out.println("Enter the height of the triangle: ");
        height = sc.nextInt();
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle is: " + area);
        sc.close();
    }
}