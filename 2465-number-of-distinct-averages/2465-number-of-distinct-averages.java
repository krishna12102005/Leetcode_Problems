class Solution {
    public int distinctAverages(int[] nums) {

        Arrays.sort(nums);

        Set<Double> set2 = new HashSet<>();

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
          
            double avg = (nums[left] + nums[right] ) / 2.0;

            set2.add(avg);

            left++;
            right--;


        }

        return set2.size();
        
    }

    
} 