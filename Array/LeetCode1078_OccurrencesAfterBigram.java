package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1078_OccurrencesAfterBigram {

    public static String[] findOcurrences(String text, String first, String second) {

        String[] words = text.split(" ");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length - 2; i++) {

            if (words[i].equals(first) && words[i + 1].equals(second)) {
                result.add(words[i + 2]);
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";

        String[] answer = findOcurrences(text, first, second);

        System.out.println(Arrays.toString(answer));
    }
}