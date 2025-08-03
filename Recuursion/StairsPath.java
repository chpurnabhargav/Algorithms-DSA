import java.util.*;
public class StairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
    }    
    public  static int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        else return  climbStairs(n-1)+climbStairs(n-2);
    }
}
