import java.text.CollationElementIterator;
import java.util.*;
 class Student implements Comparable<Student>{
    String name;
    int marks;
    int age;
    public Student(String name,int marks,int age){
        this.name=name;
        this.marks=marks;
        this.age=age;
    }
    // sort ascending marks
     // for desending marks (this.marks-other.marks)
    public int compareTo(Student other){
        return other.marks-this.marks;
    }
}
public class CustomSorting {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();
        al.add(new Student("bhargav",97,19));
        al.add(new Student("nishanth",99,20));
        al.add(new Student("gowtham",89,22));
        al.add(new Student("aashish",50,18));
        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.name+" "+st.marks+" "+st.age);
        }
    }
}
