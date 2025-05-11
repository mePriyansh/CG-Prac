import java.util.Scanner ;
class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in pounds: ");
        double pounds = sc.nextDouble();
        double kg= pounds/2.2;
        System.out.println("The weight of person in pounds is " + pounds + " and in kg is " + kg);
        sc.close();
    }    
}

