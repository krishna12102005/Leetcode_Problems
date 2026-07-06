class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        for(int i = 0 ; i < intervals.length ; i++){
            boolean It_is = Checking(intervals , i);
                if(It_is){
                    count++;
                }
            
        }


        return intervals.length - count;
    }
    public boolean Checking (int[][] arr , int index){

        int a = arr[index][0];
        int b = arr[index][1];

        for(int i = 0 ; i < arr.length ; i++){
            if(i == index){
                continue;
            }

            if(arr[i][0] <= a && arr[i][1] >= b){
                return true;

            }
        }

        return false;

    }
}