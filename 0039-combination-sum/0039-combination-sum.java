class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        combination(candidates , target , new ArrayList<>() , lst , 0);

        return lst;
    }

    public void combination(int[] arr , int target , ArrayList<Integer> list , List<List<Integer>> lst , int index){
        if(index == arr.length){
            if(target == 0){
                lst.add(new ArrayList<>(list));
            }
            return;
        }


        if(arr[index] <= target){
            list.add(arr[index]);
            combination(arr , target - arr[index] , list , lst , index);
            list.remove(list.size() - 1);

        }

        combination(arr , target , list , lst , index+1);
    }

}