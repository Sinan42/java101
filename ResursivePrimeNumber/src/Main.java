import java.util.Scanner;

public class Main {
    static int asalSayi(int x,int i) {

        if (x < 2)
            return 0;
        if (i == 1)
            return 1;
        if (x % i == 0)
            return 0;
        return asalSayi(x,i-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int num=input.nextInt();
        int result=asalSayi(num,num/2);
        if(result==1) System.out.println("Asal Sayi");
        if(result==0) System.out.println("Asal değil");


    }
}
