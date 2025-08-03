import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverse2(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int i,int j){
        if(i==j){
            return;
        }
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(arr,i+1,j-1);
    }
    public static void reverse2(int arr[] , int i,int n){
        if(i>=n/2){
            return;
        }
        int temp = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverse2(arr,i+1,n);
    }
}
