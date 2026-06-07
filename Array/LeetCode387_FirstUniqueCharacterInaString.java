package Array;

public class LeetCode387_FirstUniqueCharacterInaString {

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "loveleetcode";

        int result = firstUniqChar(s);

        System.out.println("First Unique Character Index: " + result);
    }
}