package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1636_SortArrayByIncreasingFrequency {

    static int[] frequencySort(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {

            int freqA = map.get(a);
            int freqB = map.get(b);

            if (freqA == freqB) {
                return b - a;
            }

            return freqA - freqB;
        });

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 2, 3};

        int[] result = frequencySort(nums);

        System.out.println(Arrays.toString(result));
    }
}