public class Main {
    public static void main(String[] args) {

        int n=100;
        for(int i=2;i<=n;i++){
            int cont=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    cont=1;
                    break;
                }

            }
            if(cont==0){
                System.out.print(i+"\t");
            }
        }
    }
}
