import java.util.*;

public class nversionCount {
    static int inversionCount = 0;

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {109, 33, 89, 27, 60, 10, 70};
        mergesort(arr);
        System.out.println(inversionCount);
    }

    public static void merge(int A[], int B[], int C[]) {
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else if (B[j] <= A[i]) {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        while (i < A.length) {
            C[k++] = A[i++];
        }
        while (j < B.length) {
            C[k++] = B[j++];
        }
    }

    public static void mergesort(int arr[]) {
        int n = arr.length;
        if (n == 1) {
            return;
        }
        int a[] = new int[n / 2];
        int b[] = new int[n - (n / 2)];
        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n - (n / 2); i++) {
            b[i] = arr[i + n / 2];
        }
        mergesort(a);
        mergesort(b);
        
        merge(a, b, arr);
        inversion(a, b);
        a = null;
        b = null;
    }

    public static void inversion(int a[], int b[]) {
        int i = 0;
        int j = 0;
        
        //int arr[] = {33,89,109}{10,27,60,70};
        while (i < a.length && j < b.length) {
            if (a[i] >b[j]) {
                inversionCount+=(a.length-i);
                j++;
            } else {
                i++;
            }
        }
    }
    /* OTHER METHOD
     * public  void merge(int A[], int B[], int C[]) {
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else{
                inversionCount+=(A.length-i);
                C[k] = B[j];
                j++;
            }
            k++;
        }
        while (i < A.length) {
            C[k++] = A[i++];
        }
        while (j < B.length) {
            C[k++] = B[j++];
        }
    }
     */
}
