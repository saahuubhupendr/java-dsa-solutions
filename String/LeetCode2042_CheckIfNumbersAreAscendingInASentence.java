/*
LeetCode 2042 - Check if Numbers Are Ascending in a Sentence

Approach:
- Split the sentence into tokens.
- Extract numeric tokens.
- Compare each number with the previous one.
- If any number is not strictly greater than the previous number, return false.

Time Complexity: O(n)
Space Complexity: O(n)
*/

package String;

public class LeetCode2042_CheckIfNumbersAreAscendingInASentence {

    public static boolean areNumbersAscending(String s) {

        String[] words = s.split(" ");

        int prev = -1;

        for (int i = 0; i < words.length; i++) {

            if (Character.isDigit(words[i].charAt(0))) {

                int curr = Integer.parseInt(words[i]);

                if (curr <= prev) {
                    return false;
                }

                prev = curr;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";

        System.out.println(areNumbersAscending(s));
    }
}
