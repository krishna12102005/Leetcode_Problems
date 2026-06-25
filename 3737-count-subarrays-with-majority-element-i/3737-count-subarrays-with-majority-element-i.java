class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {

        int n = nums.length;

        int[] prefix = new int[n + 1];

        for(int i = 0; i < n; i++){
            prefix[i + 1] = prefix[i];
            if(nums[i] == target){
                prefix[i + 1]++;
            }
        }

        int count = 0;
        for(int i = 0  ;i < nums.length ; i++){
            for(int j = i ; j < nums.length ; j++){
                int len = j - i + 1;
                int times = prefix[j+1] - prefix[i];
                if(times > (len/2)){
                    count++;
                }

            }
        }

        return count;
        
    }
   
}