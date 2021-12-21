import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n:");
        int n=input.nextInt();
        System.out.println("r");
        int r=input.nextInt();

        System.out.println("Combination="+factorial(n)/(factorial(r)*factorial(n-r)));


    }
    public static int factorial(int number){
        int fact=1;
        for(int i=number;1<=i;i--){
            fact=fact*i;

        }
        return fact;
    }
}
