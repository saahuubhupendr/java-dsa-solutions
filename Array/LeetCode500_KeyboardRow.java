package Array;

import java.util.*;

public class LeetCode500_KeyboardRow {

    public static String[] findWords(String[] words) {

        List<String> list = new ArrayList<>();

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (String word : words) {

            String lower = word.toLowerCase();

            String row = "";

            char first = lower.charAt(0);

            if (row1.contains(String.valueOf(first))) {
                row = row1;
            } else if (row2.contains(String.valueOf(first))) {
                row = row2;
            } else {
                row = row3;
            }

            boolean valid = true;

            for (int i = 1; i < lower.length(); i++) {

                char ch = lower.charAt(i);

                if (!row.contains(String.valueOf(ch))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        String[] ans = findWords(words);

        System.out.println(Arrays.toString(ans));
    }
}
