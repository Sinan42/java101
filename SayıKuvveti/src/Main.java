import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Number:");
        num=input.nextInt();
        for(int i=0;i<=num;i++ ){
            if(i%4==0){
                System.out.println("4 kuvvetleri:"+i);
            }
            if(i%5==0){
                System.out.println("5 kuvvetleri:"+i);
            }
        }

    }
}
