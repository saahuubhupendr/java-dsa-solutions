package Array;

public class LeetCode11_ContainerWithMostWater {

    // Brute Force Approach (O(n^2)) 
    public static int maxAreaBruteForce(int[] height) {
        int maxWater = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int w = j - i;
                int h = Math.min(height[i], height[j]);
                int currWater = w * h;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // Optimal Two-Pointer Approach (O(n))
    public static int maxArea(int[] height) {
        int maxWater = 0; 
        int lp = 0, rp = height.length - 1;

        while (lp < rp) {
            int w = rp - lp;
            int h = Math.min(height[lp], height[rp]);
            int currWater = w * h;
            maxWater = Math.max(maxWater, currWater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    // Main Method for Testing
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("Brute Force Result: " + maxAreaBruteForce(height));
        System.out.println("Optimal Two-Pointer Result: " + maxArea(height));
    }
}

