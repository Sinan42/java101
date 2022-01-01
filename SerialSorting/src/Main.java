import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=input.nextInt();
        int[] series=new int[size];
        int temp,hold;

        for(int i=0;i<size;i++){
            System.out.print(i+1+"elements of the array:");
            int a=input.nextInt();
            series[i]=a;


        }
        for(temp=1;temp<series.length;temp++)
        {
            for (int i=0;i<series.length - 1;i++)
            {
                if (series[i]>series[i+1])
                {
                    hold=series[i];
                    series[i]=series[i+1];
                    series[i+1]=hold;
                }
            }
        }
        System.out.println(Arrays.toString(series));
    }
}
