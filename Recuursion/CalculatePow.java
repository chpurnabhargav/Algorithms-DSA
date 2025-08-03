import java.util.*;
public class CalculatePow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
    public static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        else if(b%2==0){
            return pow(a,b/2)*pow(a, b/2);
        }
        else{
            return pow(a, b/2)*pow(a, b/2)*a;
        }
    }
}
