package String;

public class Leetcode123_MostWordsFound {

    public static int mostWordsFound(String[] sentences) {

        int max = 0;

        int[] arr = new int[sentences.length];

        for (int i = 0; i < sentences.length; i++) {

            String[] words = sentences[i].split(" ");

            int count = 0;

            for (int j = 0; j < words.length; j++) {
                count++;
            }

            arr[i] = count;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        String[] sentences = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };

        int result = mostWordsFound(sentences);

        System.out.println("Maximum Number of Words: " + result);
    }
}