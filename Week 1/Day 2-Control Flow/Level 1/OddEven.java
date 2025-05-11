
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner val =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = val.nextInt();
        val.close();
        System.out.println("1 is neither even nor odd");
        for(int i=2;i<=num;i++){
            if(i%2==0){
                System.out.println(i+" is even");
            }
            else{
                System.out.println(i+" is odd");
            }
        }
    }
   
}

