import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while(right>0){
            System.out.print("User name:");
            userName=input.nextLine();
            System.out.print("Password:");
            password=input.nextLine();

            if(userName.equals("patika")&&password.equals("dev123")){
                do {
                    System.out.println("1-Deposit money\n" +
                            "2-withdraw money\n"+
                            "3-balance inquiry\n"+
                            "4-exit");
                    System.out.println("Please choose");
                    select= input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Amount of money:");
                            int price=input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("Amount of money:");
                            int amount=input.nextInt();
                            if(balance<amount){
                                System.out.println("you do not have enough balance");
                            }else {
                                balance-=amount;
                            }
                            break;
                        case 3:
                            System.out.println("Balance:"+balance);
                            break;
                    }

                }while (select!=4);
                System.out.println("See you later...");

            }else{
                right--;
                System.out.println("You entered incorrectly.");
                switch (right){
                    case 0:
                        System.out.println("The account has been blocked, please contact the bank.");
                        break;
                    default:
                        System.out.println("Your remaining right:"+right);
                }

            }
        }

    }
}
