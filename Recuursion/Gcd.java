import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter b number: ");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return  gcd(b%a,a);
    }
}
