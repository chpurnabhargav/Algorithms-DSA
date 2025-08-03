public class maximumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr={10,20,1,3,-40,80,10};
        int k=3;
        //10 20 1 -> 31
        //20 1 3  -> 24
        //1 3 -40 ->-36
        //3 -40 80 ->43
        //-40 80 10 -> 50 (maximum sum of subarrays of size k)
        System.out.println(bruteForce(arr,k));
        System.out.println(slidingWindow(arr,k));
    }
    public static int bruteForce(int[] arr,int k){
        int max=0;
        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+arr[j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
    public static int slidingWindow(int[] arr,int k){
        if(k>arr.length) return -1;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int i;
        for( i=0;i<k;i++){
            sum=sum+arr[i];
        }
        max=Math.max(sum,max);
        int j=i;
        i=0;
        while(j<arr.length) {
            sum = sum + arr[j];
            sum = sum - arr[i];
            max = Math.max(max, sum);
            i++;
            j++;
        }
        return max;
    }
}
