public class InsetionSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        // for(int i=1;i<n;i++){
        //     for(int j=i;j>=1;j--){
        //         if(arr[j]<arr[j-1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j-1];
        //             arr[j-1]=temp;
        //         }
        //         else{
        //             break; 
        //         }
        //     }
        // }

        for(int i=1;i<n;i++){
            int j=i;
            while(j>=1 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
