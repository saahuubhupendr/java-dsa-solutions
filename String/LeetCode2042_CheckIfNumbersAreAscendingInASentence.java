/*
Approach:
1. Split the sentence into tokens.
2. Check whether a token starts with a digit.
3. Convert numeric tokens using Integer.parseInt().
4. Compare with the previous number.
5. If current <= previous, return false.
6. Otherwise update previous and continue.

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