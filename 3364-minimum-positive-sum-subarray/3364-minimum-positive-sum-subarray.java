class Solution {
    public int minimumSumSubarray(List<Integer> arr, int l, int r) {
        int[] nums = new int[arr.size()];
       
        for(int i = 0 ; i < arr.size() ; i++ ){
            nums[i] = arr.get(i);

        }




        int count = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
         
            for(int j = i ; j < nums.length ; j++){
                int len = j - i + 1;
                if(len >= l && len <= r){
                    int sum = sumOfArray(nums , i , j);
                    if(sum > 0){
                        count = Math.min(count , sum);
                        
                    }
                }
            }
        }

        return count == Integer.MAX_VALUE ? -1 : count;
        
    }
    public int sumOfArray(int[] arr , int start , int end ){
        int sum = 0;
        for(int i = start ; i <= end ; i++){
            sum = sum + arr[i];
        }

        return sum;
    }
}