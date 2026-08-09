package String;

public class LeetCode434_NumberOfSegments {

    public static void main(String[] args) {

        String s = "Hello, my name is John";

        System.out.println(countSegments(s)); // 5
    }

    public static int countSegments(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // New segment starts here
            if (s.charAt(i) != ' ' &&
                    (i == 0 || s.charAt(i - 1) == ' ')) {

                count++;
            }
        }

        return count;
    }
}
