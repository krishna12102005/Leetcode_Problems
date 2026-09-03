class Solution {
    public boolean uniformArray(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
        }

        if (min % 2 == 0) {
            for (int num : nums) {
                if (num % 2 != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}