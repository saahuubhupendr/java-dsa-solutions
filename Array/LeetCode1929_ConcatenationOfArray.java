package Array;



public class LeetCode1929_ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        LeetCode1929_ConcatenationOfArray solution = new LeetCode1929_ConcatenationOfArray();

        int[] nums = {1, 2, 1};

        int[] result = solution.getConcatenation(nums);

        System.out.print("Output: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}