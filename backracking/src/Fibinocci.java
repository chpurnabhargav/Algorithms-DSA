public class Fibinocci {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int first=fib(n-1);
        int second=fib(n-2);
        return first+second;
    }
}
