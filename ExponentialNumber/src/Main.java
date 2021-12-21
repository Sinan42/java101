import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayi:");
        double n = input.nextInt();
        System.out.print("Üs olacak sayi:");
        int r = input.nextInt();
        double number = 1;
        for (int i = 1; i <= r; i++) {
            number *= n;

        }
        System.out.println(number);
        System.out.println(Math.pow(n,r));

    }
}
