class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       HashMap<Long, Long> map = new HashMap<>();

        long prefixSum = 0;
        long maxSum = Long.MIN_VALUE;

        for (int num : nums) {

            long current = num;

            // nums[i] = current - k
            if (map.containsKey(current - k)) {
                long sum = prefixSum + current - map.get(current - k);
                maxSum = Math.max(maxSum, sum);
            }

            // nums[i] = current + k
            if (map.containsKey(current + k)) {
                long sum = prefixSum + current - map.get(current + k);
                maxSum = Math.max(maxSum, sum);
            }

            // Store the minimum prefix sum for this value
            if (!map.containsKey(current)) {
                map.put(current, prefixSum);
            } else {
                map.put(current, Math.min(map.get(current), prefixSum));
            }

            prefixSum += current;
        }

        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
}