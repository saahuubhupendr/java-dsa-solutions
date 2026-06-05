package String;

public class LeetCode383_RansomNote {

        public boolean canConstruct(String ransomNote, String magazine) { 
            int[] freq = new int[26];

            for (char c : magazine.toCharArray()) {
                freq[c - 'a']++;
            }

            for (char c : ransomNote.toCharArray()) {
                if (freq[c - 'a'] == 0) {
                    return false;
                } 
                freq[c - 'a']--; 
            }

            return true;
        }

        public static void main(String[] args) {
            LeetCode383_RansomNote sol = new LeetCode383_RansomNote();

            String ransomNote = "aa";
            String magazine = "aab";

            boolean result = sol.canConstruct(ransomNote, magazine);
            System.out.println("Can construct ransom note: " + result);
        }
    }
