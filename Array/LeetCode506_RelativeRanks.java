package Array;

import java.util.*;

public class LeetCode506_RelativeRanks {

    public static void main(String[] args) {

        int[] score = {10, 3, 8, 9, 4};

        int n = score.length;

        String[] answer = new String[n];

        Integer[] sorted = new Integer[n];

        for (int i = 0; i < n; i++) {
            sorted[i] = score[i];
        }

        // Decreasing order
        Arrays.sort(sorted, (a, b) -> b - a);

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int rank = i + 1;

            if (rank == 1) {
                map.put(sorted[i], "Gold Medal");
            }
            else if (rank == 2) {
                map.put(sorted[i], "Silver Medal");
            }
            else if (rank == 3) {
                map.put(sorted[i], "Bronze Medal");
            }
            else {
                map.put(sorted[i], String.valueOf(rank));
            }
        }

        for (int i = 0; i < n; i++) {
            answer[i] = map.get(score[i]);
        }

        System.out.println(Arrays.toString(answer));
    }
}
