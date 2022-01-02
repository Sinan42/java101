import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int row=input.nextInt();
        System.out.print("Please enter the number of colums: ");
        int col= input.nextInt();
        int[][] matrix=new int[row][col];
        int[][] num=new int[row][col];
        
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print((i+1)+"row"+(j+1)+" : ");
                num[i][j]=input.nextInt();
                matrix[i][j]=num[i][j];
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("\n");
        }

        System.out.println("Transpose:");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println("\n");
        }

    }

}
