class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }

        int multiple = k;
        while(true){
           if(!set.contains(multiple)){
                return multiple;
            }

            multiple += k;

        }

        
    }
}