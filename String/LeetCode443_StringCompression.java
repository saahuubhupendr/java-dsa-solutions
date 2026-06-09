/*
Problem: LeetCode 443 - String Compression

Approach:
- Traverse the character array and count consecutive repeating characters.
- Write the character to the same array using a write pointer.
- If the count is greater than 1, convert the count to a string and write each digit separately.
- Return the length of the compressed array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package String;

public class LeetCode443_StringCompression {

    public int compress(char[] chars) {

        int write = 0;

        for (int i = 0; i < chars.length; i++) {

            int count = 1;
            int j = i + 1;

            while (j < chars.length && chars[i] == chars[j]) {
                count++;
                j++;
            }

            chars[write] = chars[i];
            write++;

            if (count > 1) {

                String cnt = String.valueOf(count);

                for (int k = 0; k < cnt.length(); k++) {
                    chars[write] = cnt.charAt(k);
                    write++;
                }
            }

            i = j - 1;
        }

        return write;
    }

    public static void main(String[] args) {

        LeetCode443_StringCompression solution =
                new LeetCode443_StringCompression();

        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(solution.compress(chars1)); // 6

        char[] chars2 = {'a'};
        System.out.println(solution.compress(chars2)); // 1

        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(solution.compress(chars3)); // 4
    }
}
