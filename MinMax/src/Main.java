import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many numbers will you enter?:  ");
        int n= input.nextInt(),i=2;
        int max;
        System.out.print("1. enter the number.");
        max=input.nextInt();
        int min=max;

        while (i<=n){
            System.out.print(i+". enter the number");
            int num=input.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            i++;
        }
        System.out.println("min:"+min);
        System.out.println("max"+max);

    }

}
