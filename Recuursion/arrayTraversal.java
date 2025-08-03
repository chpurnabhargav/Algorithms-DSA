public class arrayTraversal {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;   
        print(arr,0);
    }   
    public static void print(int arr[],int i){
        if(i==arr.length){
            return;
        }
        else{
            System.out.println(arr[i]);
            print(arr,i+1); 
        }
    } 
}
