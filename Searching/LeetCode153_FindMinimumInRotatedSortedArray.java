package Searching;

public class LeetCode153_FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Minimum: " + findMin(nums1));

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum: " + findMin(nums2));

        int[] nums3 = {11, 13, 15, 17};
        System.out.println("Minimum: " + findMin(nums3));
    }
}