package Array;

public class LeetCode242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return s == t;
        if (s.length() != t.length()) return false;

        int[] counts = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int c : counts) {
            if (c != 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        LeetCode242_ValidAnagram sol = new LeetCode242_ValidAnagram();
        System.out.println(sol.isAnagram("anagram", "nagaram"));
        System.out.println(sol.isAnagram("rat", "car"));
    }
}

