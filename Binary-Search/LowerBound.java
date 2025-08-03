public class LowerBound {
    public static void main(String[] args) {
        int arr[] = {20, 30, 30, 40, 50, 60, 70};
        int lb = arr.length; // Default to array length
        int target = 30;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                lb = mid; // Update lower bound
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(lb);
    }
}
