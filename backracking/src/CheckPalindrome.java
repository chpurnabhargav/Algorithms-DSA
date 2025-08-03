public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "akka";
        System.out.println(isPalin(str,0,str.length()));
    }
    public static boolean isPalin(String str,int i,int n){
        if(str.charAt(i)!=str.charAt(n-i-1)){
            return false;
        }
        if(i>=(n-i-1)){
            return true;
        }
        return isPalin(str,i+1,n);
    }
}
