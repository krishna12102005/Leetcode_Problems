class Solution {
    public boolean checkXMatrix(int[][] grid) {
         int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Diagonal elements
                if (i == j || i + j == n - 1) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                }
                // Non-diagonal elements
                else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}