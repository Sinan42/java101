import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14,area;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter r :");
        r=input.nextInt();
        System.out.print("Pleae enter the value of angle");
        a=input.nextInt();
        area=(pi * (r*r) * a) / 360;
        System.out.print("Area:"+area);

    }
}
