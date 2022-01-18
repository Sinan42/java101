import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm=2.20,startPrice=10,total;

        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the km : ");
        km=input.nextInt();
        total=km*perKm;
        total+=startPrice;
        total=(total<20)?20:total;
        System.out.print("Price : "+total);


    }
}
