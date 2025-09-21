package Array;

class Code {
    private int[] prefix;

    // Constructor → preprocess prefix sums
    public Code(int[] nums) {
        prefix = new int[nums.length + 1];  // one extra space
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    // Query sum in range [left, right]
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}

// Main class
public class NumArray {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        Code obj = new Code(nums);

        System.out.println("sumRange(0, 2) = " + obj.sumRange(0, 2)); // 1
        System.out.println("sumRange(2, 5) = " + obj.sumRange(2, 5)); // -1
        System.out.println("sumRange(0, 5) = " + obj.sumRange(0, 5)); // -3
    }
}
