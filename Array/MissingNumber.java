package Array;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        // Formula sum of 0 to n
        int totalSum = n * (n + 1) / 2;

        int arrSum = 0;
        for (int num : nums) {
            arrSum += num;
        }

        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println("Missing Number: " + missingNumber(arr)); // Output: 2
    }
}

