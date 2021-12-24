import java.util.Scanner;

public class Main {
    static int ustAlma(int us,int taban){
        if(us==0){
            return 1;
        }

        return taban*ustAlma(us-1,taban);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değeri giriniz:");
        int taban=input.nextInt();
        System.out.print("Ust değeri giriniz: ");
        int us= input.nextInt();
        System.out.println(ustAlma(us,taban));
    }
}
