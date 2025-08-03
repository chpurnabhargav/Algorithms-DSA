import java.util.*;
public class CheckIfArrayIsSortedOrNot{
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
            }
        }
        if(isSorted){
            System.out.println("arr is sorted");
        }
        else{
            System.out.println("arr is not sorted");
        }
    }
}