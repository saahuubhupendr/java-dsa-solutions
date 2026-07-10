package String;

public class LeetCode392_IsSubsequence {

    // Function to check whether s is a subsequence of t
    public static boolean isSubsequence(String s, String t) {

        int i = 0; // Pointer for string s
        int j = 0; // Pointer for string t

        // Traverse both strings
        while (i < s.length() && j < t.length()) {

            // If characters match, move pointer of s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            // Always move pointer of t
            j++;
        }

        // If all characters of s are matched, return true
        return i == s.length();
    }

    public static void main(String[] args) {

        // Test Case 1
        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("Test Case 1");
        System.out.println("s = " + s1);
        System.out.println("t = " + t1);
        System.out.println("Output = " + isSubsequence(s1, t1));
        System.out.println();

        // Test Case 2
        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println("Test Case 2");
        System.out.println("s = " + s2);
        System.out.println("t = " + t2);
        System.out.println("Output = " + isSubsequence(s2, t2));
        System.out.println();

        // Test Case 3 (Empty s)
        String s3 = "";
        String t3 = "ahbgdc";
        System.out.println("Test Case 3");
        System.out.println("s = \"" + s3 + "\"");
        System.out.println("t = " + t3);
        System.out.println("Output = " + isSubsequence(s3, t3));
        System.out.println();

        // Test Case 4 (Both Empty)
        String s4 = "";
        String t4 = "";
        System.out.println("Test Case 4");
        System.out.println("s = \"" + s4 + "\"");
        System.out.println("t = \"" + t4 + "\"");
        System.out.println("Output = " + isSubsequence(s4, t4));
        System.out.println();

        // Test Case 5 (s longer than t)
        String s5 = "abcd";
        String t5 = "abc";
        System.out.println("Test Case 5");
        System.out.println("s = " + s5);
        System.out.println("t = " + t5);
        System.out.println("Output = " + isSubsequence(s5, t5));
    }
}
