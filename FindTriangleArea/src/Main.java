import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a,b,c,u,area;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter 1st side of triangle");
        a=input.nextDouble();
        System.out.print("Please enter 2st side of triangle");
        b=input.nextDouble();
        System.out.print("Please enter 3st side of triangle");
        c=input.nextDouble();
        u=(a+b+c)/2;
        area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("The area of triangle: "+area);



    }
}
