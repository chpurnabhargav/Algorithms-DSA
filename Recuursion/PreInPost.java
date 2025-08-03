public class PreInPost {
    public static void main(String[] args) {
        pip(3); // Example call to test the method
    }   
    public static void pip(int n) {
        if (n == 0) {
            return; // Corrected base case
        }
        System.out.println("PreOrder " + n);
        pip(n - 1);
        System.out.println("InOrder " + n);
        pip(n - 1);
        System.out.println("PostOrder " + n);
    } 
}