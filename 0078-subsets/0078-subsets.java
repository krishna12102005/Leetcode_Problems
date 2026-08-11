class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();


        subsequence(nums , 0 , list , lst);


        return lst;
    }
    public void subsequence(int[] arr , int index , ArrayList<Integer> list , List<List<Integer>> lst){
        if(index == arr.length){
           lst.add(new ArrayList<>(list));
           return ;
        }


        list.add(arr[index]);
        subsequence(arr, index+1 , list , lst);

        list.remove(list.size() - 1);

        subsequence(arr , index+1 , list , lst);

    }
}