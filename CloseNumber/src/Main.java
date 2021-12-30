import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num={15,12,788,1,-1,-778,2,0};
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen sayi giriniz: ");
        int number=input.nextInt();
        closeNumbers(num,number);

    }
    public static void closeNumbers(int[] num,int number){
        int j=0,b=0,k=0,l=0;
        int[] c=new int[num.length];
        int[] d=new int[num.length];

        for (int i:num) {
            if(i>number){
                c[j]=i;
                j++;
                b++;
            }
        }
        for (int i:num) {
            if(i<number){
                d[k]=i;
                k++;
                l++;
            }
        }
        int[] copyArray = Arrays.copyOf(c,b);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+Arrays.stream(copyArray).min().getAsInt());

        int[] copyArray2 = Arrays.copyOf(d,l);
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+Arrays.stream(copyArray2).max().getAsInt());

    }
}
