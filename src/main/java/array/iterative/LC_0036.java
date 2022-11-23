package array.iterative;

public class LC_0036 {
    public static final int BOARD_SIZE = 9;

    public boolean isValidSudoku(char[][] board) {

        int[] rows = new int[BOARD_SIZE];
        int[] cols = new int[BOARD_SIZE];
        int[] boxes = new int[BOARD_SIZE];

        for (int row = 0; row < BOARD_SIZE; row++)
            for (int col = 0; col < BOARD_SIZE; col++)
                if (board[row][col] != '.') {

                    int num = 1 << (board[row][col] - '0');
                    if ((rows[row] & num) != 0)
                        return false;
                    rows[row] |= num;

                    if ((cols[col] & num) != 0)
                        return false;
                    cols[col] |= num;

                    int pos = (row / 3) * 3 + (col / 3);
                    if ((boxes[pos] & num) != 0)
                        return false;
                    boxes[pos] |= num;
                }

        return true;
    }
}
