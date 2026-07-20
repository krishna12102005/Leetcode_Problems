class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] result = new int[m][n];

        k = k % (m * n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int oldPos = i * n + j;
                int newPos = (oldPos + k) % (m * n);

                int newRow = newPos / n;
                int newCol = newPos % n;

                result[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(result[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }
}