import java.util.*;
public class SumOfOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(100));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+sum(n-1);
        }
    }
}
