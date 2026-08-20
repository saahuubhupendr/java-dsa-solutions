package Searching;

import java.util.*;

public class LeetCode162_FindPeakElement {

    static int solve(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] <= nums[mid + 1]) {
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }

        return l;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println(solve(nums));
    }
}
