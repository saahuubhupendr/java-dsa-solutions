package Array;

import java.util.*;

public class LeetCode989_AddToArrayForm {

    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k > 0) {

            if (i >= 0) {
                k += num[i];
                i--;
            }

            result.add(k % 10);
            k = k / 10;
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {

        int[] num1 = {1, 2, 0, 0};
        int k1 = 34;

        System.out.println(addToArrayForm(num1, k1));
        // Output: [1, 2, 3, 4]

        int[] num2 = {2, 7, 4};
        int k2 = 181;

        System.out.println(addToArrayForm(num2, k2));
        // Output: [4, 5, 5]

        int[] num3 = {2, 1, 5};
        int k3 = 806;

        System.out.println(addToArrayForm(num3, k3));
        // Output: [1, 0, 2, 1]
    }
}