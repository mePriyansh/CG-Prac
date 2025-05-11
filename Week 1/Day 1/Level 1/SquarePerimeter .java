import java.util.Scanner;
class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        double side = sc.nextDouble();
        double perimeter = 4 * side;
        System.out.println("The length of side of square is " + side + "whose perimeter is " + perimeter);
        sc.close();
    }    
}