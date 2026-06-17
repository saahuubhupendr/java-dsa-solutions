package String;

public class LeetCode1160_FindWordsThatCanBeFormedByCharacters {

    public static int countCharacters(String[] words, String chars) {

        int[] freqChars = new int[26];

        for (int i = 0; i < chars.length(); i++) {

            int ch1 = chars.charAt(i) - 'a';
            freqChars[ch1]++;
        }

        int ans = 0;

        for (int i = 0; i < words.length; i++) {

            String s = words[i];

            int[] freqWords = new int[26];

            for (int j = 0; j < s.length(); j++) {

                int ch2 = s.charAt(j) - 'a';
                freqWords[ch2]++;
            }

            boolean valid = true;

            for (int k = 0; k < 26; k++) {

                if (freqWords[k] > freqChars[k]) {

                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans += s.length();
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";

        int result = countCharacters(words, chars);

        System.out.println(result);
    }
}