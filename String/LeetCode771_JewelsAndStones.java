/*
LeetCode 771 - Jewels and Stones

Approach:
- Compare each jewel with every stone using nested loops.
- Count matching characters.

Time Complexity: O(J * S)
Space Complexity: O(1)
*/

package String;

public class LeetCode771_JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {

            char chJewels = jewels.charAt(i);

            for (int j = 0; j < stones.length(); j++) {

                char chStones = stones.charAt(j);

                if (chJewels == chStones) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        LeetCode771_JewelsAndStones obj = new LeetCode771_JewelsAndStones();

        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(obj.numJewelsInStones(jewels, stones));
    }
}
