public class Main {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=10;i++){
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*(n-i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
