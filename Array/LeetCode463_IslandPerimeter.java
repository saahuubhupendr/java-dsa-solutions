package Array;

public class LeetCode463_IslandPerimeter {

    // Returns the perimeter of the island in the grid
    public static int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    // start with 4 sides
                    perimeter += 4;
                    // subtract 1 for each neighboring land cell
                    if (r > 0 && grid[r - 1][c] == 1) perimeter--;
                    if (r < rows - 1 && grid[r + 1][c] == 1) perimeter--;
                    if (c > 0 && grid[r][c - 1] == 1) perimeter--;
                    if (c < cols - 1 && grid[r][c + 1] == 1) perimeter--;
                }
            }
        }
        return perimeter;
    }

    // quick test
    public static void main(String[] args) {
        int[][] grid = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        // Expected perimeter = 16
        System.out.println("Perimeter: " + islandPerimeter(grid));
    }
}
