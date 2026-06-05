package Array;



import java.util.Arrays;

public class LeetCode455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        // Sort greed factors and cookie sizes 
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // child pointer
        int j = 0; // cookie pointer

        // Iterate until we run out of children or cookies
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                // Cookie satisfies the child
                i++;  // move to next child
            }
            j++; // always move to next cookie
        }
        return i; // number of satisfied children
    }

    // Example run
    public static void main(String[] args) {
        LeetCode455_AssignCookies sol = new LeetCode455_AssignCookies();
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(sol.findContentChildren(g, s)); // Output → 1
    }
}
