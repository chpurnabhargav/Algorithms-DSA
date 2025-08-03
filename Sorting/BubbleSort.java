public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n= arr.length;
        // //ascending
        // int c=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //             c++;
        //         }
        //     }
        // }

        //  //decsending
        //  for(int i=0;i<n;i++){
        //     for(int j=0;j<n-1;j++){
        //         if(arr[j]<arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }




        //method-2
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //             c++;
        //         }
        //     }
        // }


        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                if(isSorted(arr)){
                    break;
                }
            }
        }


        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static boolean isSorted(int arr[]){
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        return isSorted;
    }
}
