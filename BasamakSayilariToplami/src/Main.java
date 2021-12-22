import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,i=0,b=0,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Number:");
        a=input.nextInt();
        System.out.println();


        while (a!=0){
            b=a%10;
            sum+=b;
            a=a/10;
            i++;


        }

        System.out.println("sum:"+sum);
    }
}
