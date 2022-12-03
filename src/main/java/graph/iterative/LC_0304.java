package graph.iterative;

public class LC_0304 {

    private final int[][] prefix;

    public LC_0304(int[][] matrix) {
        this.prefix = getPrefix(matrix);
    }

    public int sumRegion(int rowMin, int colMin, int rowMax, int colMax) {
        int sumRegion = prefix[rowMax][colMax];

        sumRegion -= (colMin > 0) ? prefix[rowMax][colMin - 1] : 0;
        sumRegion -= (rowMin > 0) ? prefix[rowMin - 1][colMax] : 0;
        sumRegion += (rowMin > 0 && colMin > 0) ? prefix[rowMin - 1][colMin - 1] : 0;

        return sumRegion;
    }

    private static int[][] getPrefix(int[][] matrix) {

        int rows = matrix.length, cols = matrix[0].length;
        int[][] prefix = new int[rows][cols];

        for (int row = 0; row < rows; row++)
            for (int col = 0; col < cols; col++) {
                prefix[row][col] = matrix[row][col];
                prefix[row][col] += (col > 0) ? prefix[row][col - 1] : 0;
                prefix[row][col] += (row > 0) ? prefix[row - 1][col] : 0;
                prefix[row][col] -= (row > 0 && col > 0) ? prefix[row - 1][col - 1] : 0;
            }

        return prefix;
    }

}
