
import java.util.Scanner;
public class SumNaturalFor {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int sum=0;
    int sum2=n*(n+1)/2;
    for(int i=1;i<=n;i++){
        sum+=i;
    }
    System.out.println("Sum of first n natural numbers is: "+sum);
    System.out.println("Sum of first n natural numbers is: "+sum2);
    if(sum==sum2){
        System.out.println("Both are equal");
    }
    else{
        System.out.println("Both are not equal");
    }
    sc.close();
}}

