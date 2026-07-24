package Array;

public class LeetCode1920_BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans; 
    }

    public static void main(String[] args) {

        LeetCode1920_BuildArrayFromPermutation solution = new LeetCode1920_BuildArrayFromPermutation();

        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] result = solution.buildArray(nums);

        System.out.print("Output: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
