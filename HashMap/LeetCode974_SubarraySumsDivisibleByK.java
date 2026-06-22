package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetCode974_SubarraySumsDivisibleByK {

    public static int subarraysDivByK(int[] nums, int k) {

        int count = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // remainder 0 ek baar pehle se present maan lo
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // Handle negative remainders
            int rem = ((sum % k) + k) % k;

            count += map.getOrDefault(rem, 0);

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        System.out.println(subarraysDivByK(nums, k));
    }
}