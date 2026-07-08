package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode692_TopKFrequentWords {

    public static List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();

        // Count frequency of each word
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Store unique words
        List<String> result = new ArrayList<>(map.keySet());

        // Sort by frequency (descending)
        // If frequency is same, sort lexicographically (ascending)
        result.sort((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);

            if (freqA != freqB) {
                return freqB - freqA;
            }

            return a.compareTo(b);
        });

        return result.subList(0, k);
    }

    public static void main(String[] args) {

        String[] words = {
                "i", "love", "leetcode", "i", "love", "coding"
        };

        int k = 2;

        List<String> answer = topKFrequent(words, k);

        System.out.println("Top " + k + " Frequent Words:");
        System.out.println(answer);
    }
}