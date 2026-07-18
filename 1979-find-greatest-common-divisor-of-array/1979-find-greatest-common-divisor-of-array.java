class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            if(i > max){
                max  = i;
            }
        }

        for(int i : nums){
            if(i < min){
                min = i;
            }
        }
        
        int a = max;
        int b = min;

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;



        


        
    }
}