import java.util.*;
public class MergeTwoSortedArrays{
    public static void main(String[] args) {
        int A[]={1,3,5,7,9};
        int B[]={2,4,8,10};
        int n=A.length;
        int m=B.length;
        int C[]=new int[n+m];
        Merge(A, B, C);
        for(int ele:C){
            System.out.println(ele+" ");
        }
    }
    public static void Merge(int A[],int B[],int C[]){
        int i=0,j=0;
        int k=0;
        while(i<A.length && j<B.length){
            if(A[i]<=B[j]){
                C[k]=A[i];
                i++;
            }
            else if(B[j]<=A[i]){
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
}