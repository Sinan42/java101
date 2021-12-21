import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Number:");
        num=input.nextInt();
        for (int i = 0; Math.pow(4, i) <= num; i++) {
            if (i == 0) {
                System.out.print(1 + ", ");
                continue;
            }

            System.out.print((int) Math.pow(4, i) + ", ");

            if(Math.pow(5, i) <= num)
                System.out.print((int) Math.pow(5, i) + ", ");
        }

    }
}
