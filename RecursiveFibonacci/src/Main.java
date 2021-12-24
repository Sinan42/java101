public class Main {
    public static void main(String[] args) {
        fibonacci(5);

    }
    public static int fibonacci(int num){
        {
            if (num==1||num==2){
                return 1;
            }

            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}
