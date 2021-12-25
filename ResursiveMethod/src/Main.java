import java.util.Scanner;

public class Main {
    static void method(int n,int k){
        System.out.print(k+" ");
        if(k<0||k==0){
             plus(n,k+5);
        }else {
            method(n, k - 5);
        }


    }
    static void plus(int n, int k){
        System.out.print(k+" ");
        if(n==k){
            return;
        }else {
            plus(n,k+5);

        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Number:");
        int n= input.nextInt();
        int k=n;
        method(k,n);

    }
}
