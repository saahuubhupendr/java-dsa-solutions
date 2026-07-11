package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode438_FindAllAnagramsInAString {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        // Frequency of p and first window of s
        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(pFreq, sFreq)) {
            ans.add(0);
        }

        // Sliding Window
        for (int i = p.length(); i < s.length(); i++) {

            // Remove left character
            sFreq[s.charAt(i - p.length()) - 'a']--;

            // Add right character
            sFreq[s.charAt(i) - 'a']++;

            // Compare frequencies
            if (Arrays.equals(pFreq, sFreq)) {
                ans.add(i - p.length() + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = findAnagrams(s, p);

        System.out.println("String : " + s);
        System.out.println("Pattern: " + p);
        System.out.println("Answer : " + result);
    }
}
