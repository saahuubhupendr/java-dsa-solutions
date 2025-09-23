package Array;



import java.util.*;

class IntersectionofTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Store frequencies of nums1
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);  // reduce frequency
            }
        }

        // Convert List to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    // Testing
    public static void main(String[] args) {
        IntersectionofTwoArrays sol = new IntersectionofTwoArrays();  // ✅ fixed
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(sol.intersect(nums1, nums2))); // [2, 2]
    }
}
