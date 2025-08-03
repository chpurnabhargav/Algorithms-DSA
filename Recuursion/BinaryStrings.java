import java.util.Scanner;

import java.util.*;
public class BinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        Bstring(n,"");

    }
    public static void Bstring(int n,String em){
        int m = em.length();
        if(n==m){
            System.out.println(em);
            return;
        }
        Bstring(n,em+"0");
        if(em.length()==0|| em.charAt(em.length()-1)!='1'){
            Bstring(n,em+"1");
        }
        //to print all possinle binary strings of length n
        //Bstring(n,em+"0");
        //Bstring(n,em+"1");
    }
}
