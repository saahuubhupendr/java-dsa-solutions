package String;

public class LeetCode1528_ShuffleString {

    public String restoreString(String s, int[] indices) {

        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) { 
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }

    public static void main(String[] args) {

        LeetCode1528_ShuffleString solution = new LeetCode1528_ShuffleString();

        System.out.println(
                solution.restoreString(
                        "codeleet",
                        new int[]{4, 5, 6, 7, 0, 2, 1, 3}
                )
        );
    }
}
