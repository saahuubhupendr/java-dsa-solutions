package Array;

import java.util.*;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int n : nums) {
            long num = n;

            // Skip duplicates
            if ((first != null && num == first) ||
                    (second != null && num == second) ||
                    (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }

        return (third == null) ? first.intValue() : third.intValue();
    }

    // Main method to test
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1};
        int[] nums2 = {1, 2};
        int[] nums3 = {2, 2, 3, 1};

        System.out.println("Example 1: " + thirdMax(nums1)); // Output: 1
        System.out.println("Example 2: " + thirdMax(nums2)); // Output: 2
        System.out.println("Example 3: " + thirdMax(nums3)); // Output: 1
    }
}