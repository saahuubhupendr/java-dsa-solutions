package String;

public class LeetCode2062_CountVowelSubstringsOfAString {

    public int countVowelSubstrings(String word) {

        int count = 0;

        // Try every possible starting index
        for (int start = 0; start < word.length(); start++) {

            boolean hasA = false;
            boolean hasE = false;
            boolean hasI = false;
            boolean hasO = false;
            boolean hasU = false;

            // Extend substring from start index
            for (int end = start; end < word.length(); end++) {

                char ch = word.charAt(end);

                // Stop if a consonant appears
                if (!isVowel(ch)) {
                    break;
                }

                // Mark vowel presence
                if (ch == 'a') {
                    hasA = true;
                } else if (ch == 'e') {
                    hasE = true;
                } else if (ch == 'i') {
                    hasI = true;
                } else if (ch == 'o') {
                    hasO = true;
                } else if (ch == 'u') {
                    hasU = true;
                }

                // Valid vowel substring contains all 5 vowels
                if (hasA && hasE && hasI && hasO && hasU) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u';
    }

    public static void main(String[] args) {

        LeetCode2062_CountVowelSubstringsOfAString obj =
                new LeetCode2062_CountVowelSubstringsOfAString();

        String word = "aeiouu";

        int result = obj.countVowelSubstrings(word);

        System.out.println("Count = " + result);
    }
}