import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,sum=0;
        System.out.print("is perfect number :");
        number=input.nextInt();

        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;

            }
        }
        if(sum==number){
            System.out.println("Perfect Number");
        }else {
            System.out.println("It is not Perfect Number");
        }


    }
}
