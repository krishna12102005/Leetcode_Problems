class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums = MinusNumbers(nums , nums[i]);
                count++;
            }

        }

        return count;
        
    }
    public int[] MinusNumbers(int[] arr , int n){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0){
                arr[i] = arr[i] - n;
            }

            if(arr[i] < 0){
                arr[i] = 0;
            }
        }


        return arr;
    }
}