public class MarkElements {
    public static void main(String[] args) {
        int arr[]={40,12,78,34,100,57,23};
        int n = arr.length;
        //         3, 0 ,5, 2,  6,  4,  1
        int x=0;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int min_idx=0;
            for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    min_idx=j;
                }
            }
            arr[min_idx]=x;
            x--;
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]*-1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        s=StrictMath.sqrt(x);
    }
}
