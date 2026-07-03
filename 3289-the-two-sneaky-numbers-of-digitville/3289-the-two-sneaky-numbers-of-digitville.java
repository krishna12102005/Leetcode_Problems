class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }

        ArrayList<Integer> lst = new ArrayList<>();

        for(int r : map.keySet()){
            if(map.get(r) == 2){
                lst.add(r);
            }
        }


       int[] ans = new int[lst.size()];
       int k = 0;
       for(int i : lst){
        ans[k] = i;
        k++;
       }

       return ans;
    }
}