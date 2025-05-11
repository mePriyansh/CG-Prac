
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int month,day;
    System.out.println("Enter the month and day");
    month=sc.nextInt();
    day=sc.nextInt();
    sc.close();
    if((month ==3 && day>=20) || (month>3 && month<6) || (month==6 && day<21)){
        System.out.println("Its a spring season");
    }
    else{
        System.out.println("Its not a spring season");
    }
    }
}

