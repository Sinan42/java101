import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Create your map");

        System.out.print("Enter the number of row: ");
        int row = scan.nextInt();
        System.out.print("Enter the number of col :");
        int column = scan.nextInt();
        System.out.println("//////////////////////////////");


        MineSweeper ms = new MineSweeper(row,column);
//		ms.printMap();

        while(true) {
            System.out.print("Enter the number of row : ");
            row = scan.nextInt();
            System.out.print("Enter the number of col : ");
            column = scan.nextInt();
            if(!ms.openCell(row, column))
                break;
        }

        scan.close();

    }
}
