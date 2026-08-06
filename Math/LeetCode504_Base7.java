package Math;

public class LeetCode504_Base7 {

    public String convertToBase7(int num) {

        if (num == 0) {
            return "0";
        }

        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }

        if (isNegative) {
            sb.append('-');
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        LeetCode504_Base7 obj = new LeetCode504_Base7();

        System.out.println(obj.convertToBase7(100)); // 202
        System.out.println(obj.convertToBase7(-7));  // -10
        System.out.println(obj.convertToBase7(0));   // 0
    }
}
