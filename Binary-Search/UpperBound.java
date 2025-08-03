public class UpperBound {
    public static void main(String[] args) {
        int arr[]={10,20,40,50,60,70};
        int ub=arr.length;
        int target=30;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=target){
                ub=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(ub);
    }
}
