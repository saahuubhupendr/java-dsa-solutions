package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges { 


    public  static List<String> summaryRanges(int[] nums){
        List<String> res = new ArrayList<>();

        int n = nums.length;
        int i = 0;

        while (i < n){
            int start = nums[i];
            int j = i;
            while (j + 1 < n && nums[j + 1] == nums[j]+ 1){
            j++;
            }
            if(start == nums[j]){
                res.add(String.valueOf(start));
            }else {
                res.add(start+"->"+nums[j]);
            }
            i = j + 1;
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums1 = {0, 1, 2, 4, 5, 7};
        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        int[] nums3 = {};

        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + summaryRanges(nums1));

        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + summaryRanges(nums2));

        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + summaryRanges(nums3));



    }
}
