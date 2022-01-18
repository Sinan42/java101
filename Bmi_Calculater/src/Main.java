import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double height,weight,bmi;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your height as meter : ");
        height=input.nextDouble();
        System.out.print("Please enter your weight  :  ");
        weight=input.nextDouble();
        bmi=weight/(height*height);
        System.out.println("bmi:"+ bmi);
    }
}
