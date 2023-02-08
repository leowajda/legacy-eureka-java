package graph.iterative;

import static java.lang.Math.min;

public class LC_0064 {
    public int minPathSum(int[][] grid) {

        int m = grid.length, n = grid[0].length;

        for (int row = 1; row < m; row++)
            grid[row][0] += grid[row - 1][0];

        for (int col = 1; col < n; col++)
            grid[0][col] += grid[0][col - 1];

        for (int row = 1; row < m; row++)
            for (int col = 1; col < n; col++)
                grid[row][col] += min(grid[row - 1][col], grid[row][col - 1]);

        return grid[m - 1][n - 1];
    }
}
