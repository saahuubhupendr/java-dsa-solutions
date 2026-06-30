package HashMap;

import java.util.*;

public class LeetCode451_SortCharactersByFrequency {

    public static String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Convert map entries to list
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort by frequency in descending order
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // Build the result string
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "tree";

        System.out.println("Input : " + s);
        System.out.println("Output: " + frequencySort(s));
    }
}