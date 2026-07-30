class Solution {
    public int diagonalPrime(int[][] nums) {
        int prime = 0;

        // Main Diagonals 
        for(int i = 0 ; i < nums.length ; i++){
            int val = nums[i][i];

            boolean itis = isPrime(val);

            if(itis){
                if(val > prime){
                    prime = val;
                }
            }
        }


        // Second Diagonal 
        int n = nums.length;
        for(int i = 0 ; i < nums.length ; i++){
            int val = nums[i][n - 1 - i];

            boolean itis = isPrime(val);
            if(itis){
                if(val > prime){
                    prime  = val;
                }
            }
        }


        return prime;

    }
    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2 ; i * i <= n ;  i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    } 
}