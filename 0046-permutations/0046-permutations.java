class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq  = new boolean[nums.length];
        Permutaions(nums, ans , new ArrayList<>() , freq);

        return ans;
    }
    public void Permutaions(int[] arr , List<List<Integer>> ans , List<Integer> ds , boolean[] freq){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return ;
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                Permutaions(arr , ans , ds , freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }

    }
}