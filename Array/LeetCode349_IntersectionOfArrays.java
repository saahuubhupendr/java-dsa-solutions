package Array;

import java.util.*; 

public class LeetCode349_IntersectionOfArrays {

    // Function to find intersection
    public static int[] intersection(int[] nums1, int[] nums2) {

        // Step 1: Store nums1 elements in a set
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Step 2 check nums2 elements againsts set1
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Step 3 convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] result = intersection(nums1, nums2);

        // Print result
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
