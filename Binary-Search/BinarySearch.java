import java.util.Arrays;

public class BinarySearch{
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,10,140};
        //arr should always be sorted;
        Arrays.sort(arr);
        boolean flag=false;
        int low=0;
        int high=arr.length-1;
        int target=140;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
        }
        System.out.println(flag);
    }
}