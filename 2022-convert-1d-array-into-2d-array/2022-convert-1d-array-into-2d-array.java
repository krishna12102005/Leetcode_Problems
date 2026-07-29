class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        int[][] ans = new int[m][n];

        if(arr.length != m * n){
            return new int[][] {};
        }

        int index = 0;
        for(int  i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                ans[i][j] = arr[index];
                index++;
            }
        }

        return ans;
    }
}