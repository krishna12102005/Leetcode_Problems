class Solution {
    public int maximumLengthSubstring(String s) {
        char [] arr = s.toCharArray();
        int max = 0;
        int low = 0 ;
        HashMap<Character , Integer> map = new HashMap<>();


        for(int high = 0 ; high < arr.length ; high++){
            map.put(arr[high] , map.getOrDefault(arr[high] , 0) + 1);

            while(map.get(arr[high]) > 2){
                map.put(arr[low] , map.get(arr[low]) - 1);
                low++;
            }

            max = Math.max (max , high - low + 1);
        }




        return max;
    }
}