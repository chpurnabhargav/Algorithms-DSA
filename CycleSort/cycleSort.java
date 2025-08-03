import java.util.*;
public class cycleSort{
    public static void main(String[] args) {
        int arr[]={0,4,3,1,2};
        print(arr);
        cycleSort(arr);
        print(arr);
    }
    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void cycleSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i) { 
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}