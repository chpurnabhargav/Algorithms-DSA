public class OneToN {
    public static void main(String[] args) {
        int n =10;
        oneToN(n);
    }
    public static void oneToN(int n){
        if(n==0){
            return;
        }
        oneToN(n-1);
        System.out.println(n);
    }
}
