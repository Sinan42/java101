public class Main {
    public static boolean isPalindrom(String str){
        String rev="";
        for(int i=str.length()-1;i >= 0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrom("abba"));;

    }
}
