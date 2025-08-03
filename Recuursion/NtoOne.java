public class NtoOne {
    public static void main(String[] args) {
        recursion(5); 
    }

    public static void recursion(int x) {
        if (x==0) {
            return;
        }
        recursion(x - 1);
        System.out.println(x);
        
    }
}

