import java.util.ArrayList;

public class SubSets {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ArrayList<Integer> em = new ArrayList<>();
        subsets(0, nums, em);
        System.out.println(list); // Print the list of subsets
    }
    public static void subsets(int i, int[] nums, ArrayList<Integer> em) {
        if (i == nums.length) {
            list.add(new ArrayList<>(em)); // Add the current subset to the list
            return;
        }
        em.add(nums[i]); // Take the current number
        subsets(i + 1, nums, em);
        em.remove(em.size() - 1); // Backtrack and remove the number
        subsets(i + 1, nums, em); // Don't include the current number
    }
}
