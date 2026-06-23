package HashMap;

import java.util.*;

public class LeetCode1207_UniqueOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : map.values()) {

            if (set.contains(num)) {
                return false;
            }

            set.add(num);
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 1, 3};

        System.out.println(uniqueOccurrences(arr));
    }
}