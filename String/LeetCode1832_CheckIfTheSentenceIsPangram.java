package String;

public class LeetCode1832_CheckIfTheSentenceIsPangram {

    public static boolean checkIfPangram(String sentence) {

        boolean[] attend = new boolean[26];
        int count = 0; 

        for (int i = 0; i < sentence.length(); i++) {

            int idx = sentence.charAt(i) - 'a';

            if (attend[idx] == false) {
                attend[idx] = true;
                count++; 
            }
        }

        return count == 26; 
    }

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = checkIfPangram(sentence);

        System.out.println("Input : " + sentence);
        System.out.println("Output: " + result);
    }
}