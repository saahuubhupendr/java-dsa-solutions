package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode846_HandOfStraights {

    public static boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0) {
            return false;
        }

        Arrays.sort(hand);

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each card
        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Try to form groups
        for (int num : hand) {

            if (map.get(num) == 0) {
                continue;
            }

            for (int i = 0; i < groupSize; i++) {

                int current = num + i;

                if (!map.containsKey(current) || map.get(current) == 0) {
                    return false;
                }

                map.put(current, map.get(current) - 1);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;

        boolean result = isNStraightHand(hand, groupSize);

        System.out.println(result);
    }
}