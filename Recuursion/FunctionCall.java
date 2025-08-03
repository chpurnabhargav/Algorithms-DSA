import java.util.*;
public class FunctionCall {
    public static void main(String[] args) {
        System.out.println("I am main");
        apple();
    }
    public static void apple(){
        banana();
        System.out.println("Apple");
        mango();
    }
    public static void mango(){
        System.out.println("Mango");
        banana();
    }
    public static void banana(){
        System.out.println("Banana");
    }
}
