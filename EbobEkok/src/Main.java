import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n1=");
        int n1=input.nextInt();
        System.out.print("n2=");
        int n2= input.nextInt();
        int num,i=1,n = 0;
        if(n1>n2){
            num=n2;
        }else if(n2<n1){
             num=n2;

        }else{
             num=n1;

        }
        while(i<=num){
            if(n1%i==0&&n2%i==0){
                n=i;

            }

            i++;

        }
        System.out.println("EBOB:"+n);
        System.out.println("EKOK:"+((n1*n2)/n));



        

    }
}
