package HashMap;

import java.util.ArrayList;
import java.util.List;

public class RunCode_LeetCode763_PartitionLabels {

    public static List<Integer> partitionLabels(String s) {

        int[] lastIndex = new int[26];

        // Store last occurrence of every character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();

        int start = 0;
        int end = 0;

        // Create partitions
        for (int i = 0; i < s.length(); i++) {

            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);

            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "ababcbacadefegdehijhklij";

        List<Integer> ans = partitionLabels(s);

        System.out.println(ans);
    }
}