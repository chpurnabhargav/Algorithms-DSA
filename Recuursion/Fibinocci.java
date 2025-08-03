import java.util.*;
public class Fibinocci {
    public static void main(String[] args) {
        System.out.println(fib(9));
    }
    public static int  fib(int n){
        return (n<=1)? n :  fib(n-1)+fib(n-2);
    }
}
