package Array;



import java.util.*; 

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Step 1: Mark visited numbers 
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;  // correct index
            if (nums[index] > 0) {
                nums[index] = -nums[index];  // mark as visited

            }
        }

        // Step 2: Collect missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {  // not visited → missing
                result.add(i + 1);
            }
        }

        return result;
    }

    // Test code
    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray sol = new FindAllNumbersDisappearedInAnArray();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(sol.findDisappearedNumbers(nums)); // [5, 6]
    }
}
