class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();


        int n = nums.length;

        int total = 1 << n ;

        for(int mask = 0 ; mask < total ; mask++){
            List<Integer> ans = new ArrayList<>();

            for(int i = 0 ; i < n ; i++){
                if((mask & (1 << i)) != 0){
                    ans.add(nums[i]);
                }
            }

            lst.add(ans);
        }

        return lst;
        
    }
}