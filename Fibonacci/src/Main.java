import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Number");
        int num=input.nextInt();
        int n1=0,n2=1,sum;
        System.out.print("Fibonacci Series:");
        System.out.print(n1+"\t"+n2);
        for(int i=2;i<num;i++){
            sum=n1+n2;
            System.out.print("\t"+sum);
            n1=n2;
            n2=sum;


        }



    }
}
