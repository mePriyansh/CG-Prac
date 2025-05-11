import java.util.Scanner;

class UserDistanceConversion {
    public static void main(String[] args) {
        Scanner newObj= new Scanner(System.in);
        System.out.println("Enter the distance in km to convert into miles: ");
        double km = newObj.nextDouble();
        double miles = km/1.6;
        System.out.println("The total miles is "+miles+ " mile for given "+ km + " km");
        newObj.close();
    }    
}

