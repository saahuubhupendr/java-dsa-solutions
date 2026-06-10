/*
Problem: LeetCode 75 - Sort Colors

Approach:
- Used Dutch National Flag Algorithm.
- Maintained three pointers: low, mid, and high.
- Placed 0s at the beginning, 2s at the end, and kept 1s in the middle.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package Array;

public class LeetCode75_SortColors {

    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        LeetCode75_SortColors solution = new LeetCode75_SortColors();

        solution.sortColors(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
