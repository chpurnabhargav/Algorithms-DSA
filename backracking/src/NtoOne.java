public class NtoOne {
    public static void main(String[] args) {
        int n = 10;
        ntoOne(n);
    }
    public static void ntoOne(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        ntoOne(n-1);
    }
}
