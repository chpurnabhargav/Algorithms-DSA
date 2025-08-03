import java.util.*;
public class Vipula {
    static class Chinnu implements Comparable<Chinnu>{
        int age;
        int weight;
        String Grad;
        double height;
        public Chinnu(int age,int weight,String Grad,double height){
            this.age=age;
            this.weight=weight;
            this.Grad=Grad;
            this.height=height;
        }
        public int compareTo(Chinnu other){
            return other.weight-this.weight;
        }
    }
    public static void main(String[] args) {
        List<Chinnu> list = new ArrayList<>();
        list.add(new Chinnu(21,79,"b",170.5));
        list.add(new Chinnu(20,89,"a",174.5));
        list.add(new Chinnu(19,99,"d",176.30));
        list.add(new Chinnu(18,109,"e",170.5));
        Collections.sort(list);
        for(Chinnu ele:list) {
            System.out.println(ele.age + " " + ele.Grad+" "+ele.height+" "+ele.weight);
        }
    }
}
