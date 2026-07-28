class Solution {
    public boolean checkValid(int[][] mat) {
        int n = mat.length;

        for(int i = 0 ; i < n ; i++){
            boolean[] arr = new boolean[n+1];
            for(int j = 0 ; j < n ; j++){
                int num = mat[i][j];
                if(num < 1 || num > n || arr[num]){
                    return false;
                }

                arr[num] = true;
            }
        }

        for(int j = 0 ; j < n ; j++){
            boolean [] arr = new boolean[n+1];
            for(int i = 0 ; i < n ; i++){
                int num = mat[i][j];

                if(num < 1 || num > n || arr[num]){
                    return false;
                }

                arr[num] = true;
            }

            
        }

        return true;
    }
}