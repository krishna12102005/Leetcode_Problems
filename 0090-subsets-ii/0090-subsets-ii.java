class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
          Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        int start = 0;

        for (int i = 0; i < nums.length; i++) {

            int size = result.size();

            // If duplicate, start from subsets created
            // during the previous iteration
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = prevsize;
            } else {
                start = 0;
            }

            for (int j = start; j < size; j++) {

                List<Integer> newList =
                    new ArrayList<>(result.get(j));

                newList.add(nums[i]);

                result.add(newList);
            }

            prevsize = size;
        }

        return result;
    }
    int prevsize;
}