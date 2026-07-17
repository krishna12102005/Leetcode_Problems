class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         List<Integer> [] bucket = new List[nums.length+1];
         HashMap<Integer, Integer> map = new HashMap<>();

         for(int i : nums){
            map.put(i , map.getOrDefault(i , 0)+1);
         }

         for(int j : map.keySet()){
            int freq = map.get(j);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            } 

            bucket[freq].add(j);
         }

         int[] res = new int[k];
         int index = 0;

         for(int i = bucket.length-1 ; i >= 0 && index < k; i--){
            if(bucket[i] != null){
                for(Integer Integer : bucket[i]){
                    res[index] = Integer;
                    index++;
                }

                if(index == k){
                    break;
                }
            }
         }

         return res;




    }
}