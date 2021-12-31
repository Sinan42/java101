import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr,int value){
        for (int i:arr) {
            if(i==value){
                return true;
            }

        }
        return false;

    }
    public static void main(String[] args) {

        int[] num={1,2,2,4,4,36,36,3,4,5,6,7,1,3};
        int[] duplicate=new int[num.length];
        int startIndex=0;

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if((i!=j)&&(num[i]==num[j])&&(num[i]%2==0)){
                    if(!isFind(duplicate,num[j]))
                    duplicate[startIndex++]=num[j];

                }
      }


        }
        for (int value: duplicate) {
            if(value!=0){
                System.out.println(value);
            }

        }




    }

}
