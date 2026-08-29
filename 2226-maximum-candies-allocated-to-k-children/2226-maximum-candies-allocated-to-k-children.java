class Solution {
    public int maximumCandies(int[] candies, long k) {
        int ans = 0;

        // Finding the maximum value
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        int low = 1; 
        int high = max;


        while(low <= high){
            int mid = (low + high) / 2;
            long count = 0;

            for(int i = 0 ; i < candies.length ; i++){
                count = count + candies[i] / mid;
            }

            

            if(count >= k){
                low = mid + 1;
                ans= Math.max(ans , mid);
            }

            else{
                high = mid - 1;
            }




        }

        return ans;


    }
}