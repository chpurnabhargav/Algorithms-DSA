public class PrintNTimes {
    public static void main(String[] args) {
        int n = 5;
        printNtimes("Bhargav",n);
    }
    public  static void printNtimes(String name,int n){
        if(n==0){
            return;
        }
        System.out.println(name);
        printNtimes(name,n-1);
    }
}
