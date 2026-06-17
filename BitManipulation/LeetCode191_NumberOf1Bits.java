/*
Problem: LeetCode 191 - Number of 1 Bits

Approach:
- Checked the last bit using (n & 1).
- If the bit is 1, incremented the count.
- Used unsigned right shift (>>>) to process all bits.
- Continued until all bits were checked.

Time Complexity: O(32) ≈ O(1) 
Space Complexity: O(1)
*/ 

package BitManipulation;

public class LeetCode191_NumberOf1Bits {

    public int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {

            count += (n & 1);

            n >>>= 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 11; // Binary: 1011

        LeetCode191_NumberOf1Bits solution = new LeetCode191_NumberOf1Bits();

        int result = solution.hammingWeight(n);

        System.out.println("Number of 1 Bits: " + result);
    }
}
