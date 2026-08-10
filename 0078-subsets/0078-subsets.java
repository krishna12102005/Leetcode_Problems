class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<Integer>());

        for(int num : nums){
           
           int size = lst.size();

           for(int i = 0 ; i < size ; i++){
               List<Integer> l = new ArrayList<>(lst.get(i));

               l.add(num);


               lst.add(l);
           }
        }

        return lst;
    }
}