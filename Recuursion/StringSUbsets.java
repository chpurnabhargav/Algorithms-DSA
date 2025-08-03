import java.util.*;
public class StringSUbsets {
    public static void main(String[] args) {
        String s="abc";
        String em="";
        subsets(0,s,em);
    }
    public static void subsets(int i,String s,String em){
       if(i==s.length()){
              System.out.println(em);
              return;
       }
        subsets(i+1,s,em+s.charAt(i));
        subsets(i+1,s,em);
    }
}
