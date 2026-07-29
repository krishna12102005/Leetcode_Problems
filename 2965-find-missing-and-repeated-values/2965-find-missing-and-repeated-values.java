class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int square = n * n;
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                lst.add(grid[i][j]);
            }
        }

        int repeated = 0 ;
        

        Set<Integer> set = new HashSet<>();

        for(int i : lst){
            if(!set.contains(i)){
                set.add(i);
            }
            else{
               repeated = i;
            }
        }

        int sum = 0;
        for(int i : set){
            sum += i;
        }

        int natural = (square * (square + 1)) / 2;

        int missing = natural - sum;


        return new int[] {repeated , missing};
        


    }
}