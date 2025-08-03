import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        String s="abc";
        Permutations("",s);
    }
    public static void Permutations(String ans,String s){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }q
    for(int i=0;i<s.length();i++){
        String left=s.substring(0,i);
        String right=s.substring(i+1);
        String rest=left+right;
        Permutations(ans+s.charAt(i),rest);
    }
    }
}
