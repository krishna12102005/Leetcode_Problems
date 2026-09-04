class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int index = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            int stable = Instability(nums , i);
            if(stable <= k){
                index = Math.min(index , i);
            }
        }

        if(index == Integer.MAX_VALUE){
            return -1;
        }

        return index;

        
         
    }
    public int Instability(int [] arr , int i ){
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;

         for(int l = 0 ; l <= i ; l++){
            max = Math.max(max , arr[l]);
         }

         for(int k = i ; k < arr.length ; k++){
            min = Math.min(min , arr[k]);
         }

        int stable = max - min;

        return stable ;

    }
}