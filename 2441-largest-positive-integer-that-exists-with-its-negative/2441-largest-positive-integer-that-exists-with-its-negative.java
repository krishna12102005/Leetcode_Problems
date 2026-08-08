class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);


        int first = 0;
        int last = nums.length-1;

        while(first < last){
            if(nums[first] < 0){
                 int value1 = Math.abs(nums[first]);

                 if(value1 == nums[last]){
                    return nums[last];
                 }

                 if(value1 > nums[last]){
                    first++;
                }

                else{
                   last--;
                }
            }

            else{
                break;
            }
           
        }


        return -1;
    }
}