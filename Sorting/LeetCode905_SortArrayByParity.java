package Sorting;

import java.util.Arrays;

public class LeetCode905_SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {

        int left = 0; 
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] % 2 == 0) {
                left++;
            }
            else if (nums[right] % 2 != 0) {
                right--;
            }
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        LeetCode905_SortArrayByParity solution =
                new LeetCode905_SortArrayByParity();

        int[] nums = {3, 1, 2, 4};

        int[] result = solution.sortArrayByParity(nums);

        System.out.println(Arrays.toString(result));
    }
}