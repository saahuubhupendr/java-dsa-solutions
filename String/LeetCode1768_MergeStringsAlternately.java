package String;

public class LeetCode1768_MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {

        String ans = "";

        int n = Math.max(word1.length(), word2.length());

        for (int i = 0; i < n; i++) {

            if (i < word1.length()) {
                ans += word1.charAt(i);
            }

            if (i < word2.length()) {
                ans += word2.charAt(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeAlternately(word1, word2));
    }
}