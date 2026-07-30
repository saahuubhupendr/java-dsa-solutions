package Array;

public class LeetCode605CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {

                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {

        int[] flowerbed1 = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowerbed1, 1));

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowerbed2, 2));
    }
}
