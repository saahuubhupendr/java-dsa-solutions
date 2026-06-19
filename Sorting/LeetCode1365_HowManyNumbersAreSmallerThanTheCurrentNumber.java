package Sorting; 

import java.util.Arrays;

public class LeetCode1365_HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {8, 1, 2, 2, 3};
        int[] nums2 = {6, 5, 4, 8};
        int[] nums3 = {7, 7, 7, 7};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums1)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums2)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums3)));
    }
}
