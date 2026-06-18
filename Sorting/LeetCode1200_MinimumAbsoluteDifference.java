package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1200_MinimumAbsoluteDifference {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        // Find minimum difference
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] - arr[i] < min) {
                min = arr[i + 1] - arr[i];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        // Collect pairs having minimum difference
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] - arr[i] == min) {

                List<Integer> pair = new ArrayList<>();

                pair.add(arr[i]);
                pair.add(arr[i + 1]);

                ans.add(pair);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 3};

        List<List<Integer>> result = minimumAbsDifference(arr);

        System.out.println(result);
    }
}