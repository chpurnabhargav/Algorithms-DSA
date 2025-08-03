public class SkipACharacter {
    public static void main(String[] args) {
        String s="Bhargav";
        String em="";
        print(s,0,"");
    }
    public static void print(String s,int i,String em){
        if(i==s.length()){
            System.out.print(em);
            return;
        }
        
        if(s.charAt(i)!='a'){
            em+=s.charAt(i);
        }
        print(s,i+1,em);
    }
}
