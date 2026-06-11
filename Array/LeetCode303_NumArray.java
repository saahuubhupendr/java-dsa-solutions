package Array;

class NumArray {

    private int[] prefix;

    // Constructor 
    public NumArray(int[] nums) {

        prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    // Return sum of range [left, right]
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}

public class LeetCode303_NumArray {

    public static void main(String[] args) {

        int[] nums = {-2, 0, 3, -5, 2, -1};

        NumArray obj = new NumArray(nums);

        System.out.println("sumRange(0, 2) = " + obj.sumRange(0, 2));
        System.out.println("sumRange(2, 5) = " + obj.sumRange(2, 5));
        System.out.println("sumRange(0, 5) = " + obj.sumRange(0, 5));
    }
}