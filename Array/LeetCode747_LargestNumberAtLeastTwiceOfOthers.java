package Array;

public class LeetCode747_LargestNumberAtLeastTwiceOfOthers {

    public static int dominantIndex(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        if (max >= 2 * secondMax) {
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {3, 6, 1, 0};

        System.out.println(dominantIndex(nums));
    }
}
