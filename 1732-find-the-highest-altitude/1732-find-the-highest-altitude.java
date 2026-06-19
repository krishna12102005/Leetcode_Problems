class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length];

        prefix[0] = gain[0];

        for(int i  = 1 ; i < gain.length ; i++){
            prefix[i] = prefix[i-1] + gain[i];
        }

        int max = prefix[0];
        for(int i = 0 ; i < prefix.length  ; i++){
            if(prefix[i] > max){
                max = prefix[i];
            }
        }

        if(max >= 1){
            return max;
        }


        return 0;
    }
}