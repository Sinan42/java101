import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int mat,phys,chem,tur,hist,music,average;
        System.out.print("enter to math note:  ");
        mat=input.nextInt();
        System.out.print("enter to history note:  ");
        phys=input.nextInt();
        System.out.print("enter to physics note:  ");
        chem=input.nextInt();
        System.out.print("enter to chemistry note:  ");
        tur=input.nextInt();
        System.out.print("enter to turkish language note:  ");
        hist=input.nextInt();
        System.out.print("enter to music note:  ");
        music=input.nextInt();
        average=(mat+phys+chem+tur+hist+music)/6;
        String result=average>60 ? "Passed" :"Failed";
        System.out.println(result);






    }
}
