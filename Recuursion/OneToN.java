import java.util.*;

public class OneToN {
    public static void main(String[] args) {
        recursion(1, 5); 
    }

    public static void recursion(int x, int n) {
        if (x > n) {
            return;
        }
        System.out.println(x);
        recursion(x + 1, n);
    }
}
