package Math;

public class LeetCode1979_FindGreatestCommonDivisorOfArray { 

    public static int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        while (max % min != 0) {

            int remainder = max % min;
            max = min;
            min = remainder;
        }

        return min;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 6, 9, 10};

        int result = findGCD(nums);

        System.out.println("GCD = " + result);
    }
}
