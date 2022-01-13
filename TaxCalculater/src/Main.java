import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double price,tax1,tax2,onlyTax1,onlyTax2;
        System.out.print("Please enter the price: ");
        price=input.nextInt();
        tax1=price+price*0.18;
        tax2=price+price*0.08;
        onlyTax1=price*0.18;
        onlyTax2=price*0.08;
        boolean find=price<1000&&price>0;

        double tax=find?tax1:tax2;
        System.out.println("Tax: "+tax);
        double onlyTax=find?onlyTax1:onlyTax2;
        System.out.println("Only tax:"+onlyTax);
    }
}
