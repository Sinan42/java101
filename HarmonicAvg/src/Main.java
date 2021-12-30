public class Main {
    public static void main(String[] args) {
        double[] num={1,2,3,4,5,6,7,8,9,10};

        System.out.println(harmonicAvg(num));



    }
    public static double harmonicAvg(double[] num){
        double sum=0;
        for(double i:num){

            sum+= 1 /i;

        }

        return num.length/sum;
    }

}
