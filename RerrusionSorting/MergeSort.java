public class MergeSort {
    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={80,30,50,20,60,10,70,40};
        print(arr);
        mergesort(arr);
        print(arr);
    }
    public static void merge(int A[],int B[],int C[]){
        int i=0,j=0;
        int k=0;
        while(i<A.length && j<B.length){
            if(A[i]<=B[j]){
                C[k]=A[i];
                i++;
            }
            else if(B[j]<A[i]){
                C[k]=B[j];
                j++;
            }
            k++;
        }
        while(i<A.length){
            C[k++]=A[i++];
        }
        while(j<B.length){
            C[k++]=B[j++];
        }
    }
    public static void mergesort(int arr[]){
        int n=arr.length;
        if(n==1){
            return;
        }
        int a[]= new int[n/2];
        int b[]=new int[n-(n/2)];
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-(n/2);i++){
            b[i]=arr[i+n/2];
        }
        //magic
        mergesort(a);
        mergesort(b);
        //merge these 'a' & 'b'
        merge(a,b,arr);
        //delete a and b
        a=null;
        b=null;
    }
}
