class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        if(n % 2 != 0){
              int one = PrimaryDiagonal(mat);
              int two = SecondaryDiagonal(mat);
              sum = one + two;

        }
        else{
               int one = PrimaryDiagonal(mat);
              int two = SecondaryDiagonal(mat);
              sum = one + two;

        }

        return sum;
    }
    public int PrimaryDiagonal(int[][] mat){
        int sum = 0;
        for(int i = 0 ; i < mat.length ; i++){
            sum = sum + mat[i][i];
        }

        return sum;
    }

    public int SecondaryDiagonal(int[][] mat){
         int n = mat.length;
         int sum = 0;
         if(n%2 == 0){
           
            for(int i = 0 ; i < n ; i++){
                sum = sum + mat[i][n-1-i];
            }

         }
         else{
            
            int center = n / 2;
            for(int i = 0 ; i < n ; i++){
                if(i != center){
                    sum = sum + mat[i][n-1-i];
                }    
            }
          
         }
         return sum;
    }
}