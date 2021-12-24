import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    static boolean isPalindrome(int number){
        int rem,rev = 0,temp=number;
        while(number!=0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;


        }
        if(temp==rev){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Number:");
        int number= input.nextInt();

        if(isPalindrome(number)==true){
            System.out.println(number+"=   is Palindrome");
        }else System.out.println(number+"= is not Palindrome");

    }

}
