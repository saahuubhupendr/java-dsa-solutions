package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1394FindLuckyIntegerInAnArray {

    public static int findLucky(int[] arr) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int largestLucky = -1;

        // Find the largest lucky integer
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                largestLucky = Math.max(largestLucky, entry.getKey());
            }
        }

        return largestLucky;
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 2, 3, 4};
        int[] arr2 = {1, 2, 2, 3, 3, 3};
        int[] arr3 = {2, 2, 2, 3, 3};

        System.out.println("Output 1: " + findLucky(arr1));
        System.out.println("Output 2: " + findLucky(arr2));
        System.out.println("Output 3: " + findLucky(arr3));
    }
}