package Array;

import java.util.Arrays;

public class LeetCode1657_DetermineIfTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count character frequencie
        for (int i = 0; i < word1.length(); i++) {
            freq1[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word2.length(); i++) {
            freq2[word2.charAt(i) - 'a']++;
        }

        // Check if both strings contain the same unique characters
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] > 0) ||
                    (freq1[i] > 0 && freq2[i] == 0)) {
                return false;
            }
        }

        // Compare sorted frequencies
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
    // Driver Code
    public static void main(String[] args) {

        LeetCode1657_DetermineIfTwoStringsAreClose solution =
                new LeetCode1657_DetermineIfTwoStringsAreClose();

        String word1 = "cabbba";
        String word2 = "abbccc";

        boolean result = solution.closeStrings(word1, word2);

        System.out.println("Word 1 : " + word1);
        System.out.println("Word 2 : " + word2);
        System.out.println("Are Close Strings? " + result);
    }
}
