import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double result=0,n;
        System.out.print("Enter number:");
        n= input.nextInt();

        for(double i=1;i<=n;i++){
            result+=(1/i);



        }
        System.out.printf("result:%.2f",result);
    }
}
