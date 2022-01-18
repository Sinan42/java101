import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00,toplam=0;
        int kg;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut kg giriniz:");
        kg=input.nextInt();
        toplam+=armut*kg;
        System.out.print("Elma kg giriniz:");
        kg=input.nextInt();
        toplam+=elma*kg;
        System.out.print("Domates kg giriniz:");
        kg=input.nextInt();
        toplam+=domates*kg;
        System.out.print("Muz kg giriniz:");
        kg=input.nextInt();
        toplam+=muz*kg;
        System.out.print("Patlıcan kg giriniz:");
        kg=input.nextInt();
        toplam+=patlıcan*kg;
        System.out.println("Toplam tutar : "+toplam);


    }
}
