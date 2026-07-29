class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        // Row iteratioon

        for(int i = 0 ; i < matrix.length ; i++){
            int min = Integer.MAX_VALUE;
            int colum = 0;
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    colum = j;
                }
            }
            int max = FindMax(matrix , colum);
            if(min == max){
                lst.add(min);
            }
        }

        return lst;

       
    }
    public int FindMax(int[][] matrix  , int column){
         int max = Integer.MIN_VALUE;
         for(int i =0 ; i < matrix.length ; i++){
            max = Math.max(max , matrix[i][column]);
         }

         return max;
    }
}