package Array;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;  // increase streak
                maxCount = Math.max(maxCount, count); // update max
            } else {
                count = 0; // reset streak on zero
            }
        }

        return maxCount; 
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum consecutive ones: " + findMaxConsecutiveOnes(nums));
    }
}
