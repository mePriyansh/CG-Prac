import java.util.Scanner;
class SI{
    public static void main(String[] args){
        double prin,rate,time,si;
        Scanner newObj=new Scanner(System.in);
        System.out.println("Enter Principal:");
        prin=newObj.nextDouble();
        System.out.println("Enter Rate:");
        rate=newObj.nextDouble();
        System.out.println("Enter Time:");
        time=newObj.nextDouble();
        si=(prin*rate*time)/100;
        System.out.println("The Simple Interest is "+si);
        newObj.close();
}
}

