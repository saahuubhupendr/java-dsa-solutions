package Array;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int lastNonZero = 0; // index to place next non-zero

        // Step 1 Move non-zero numbers forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero++] = nums[i];
            }
        }

        // Step 2 Fill remaining with zeros 
        while (lastNonZero < nums.length) {
            nums[lastNonZero++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before moving zeros:");
        for (int n : nums) {
            System.out.print(n + " ");
        }

        moveZeroes(nums);

        System.out.println("\nAfter moving zeros:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}

