import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrSubSequence {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        subS(al,0,ans,new ArrayList<>());
        System.out.println(ans);
    }
    public static void subS( List<Integer> al , int i,List<List<Integer>> ans ,List<Integer> em){
        if(i==al.size()){
            ans.add(new ArrayList<>(em));
            return;
        }
        subS(al,i+1,ans,em);
        em.add(al.get(i));
        subS(al,i+1,ans,em);
        em.remove(em.size()-1);
    }
}
