class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        int ans = 0;
        for(int i = nums.length-1 ; i >= 0 ; i--){
            ans = nums[i];
            k--;

            if(k == 0){
                return ans;
            }

        }


        return ans;
    }
}