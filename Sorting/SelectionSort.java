public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {10,-4, 20 ,1 ,-6 ,8 };
        int n = arr.length;
        //ascending
        for(int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int minIdx=0;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
        //descending
        // for(int i=0;i<n-1;i++){
        //     int max=Integer.MIN_VALUE;
        //     int maxIdx=0;
        //     for(int j=i;j<n;j++){
        //         if(arr[j]>max){
        //             max=arr[j];
        //             maxIdx=j;
        //         }
        //     }
        //     int temp=arr[i];
        //         arr[i]=arr[maxIdx];
        //         arr[maxIdx]=temp;
        // }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
  