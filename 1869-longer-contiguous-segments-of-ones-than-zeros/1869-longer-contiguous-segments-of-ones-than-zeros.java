class Solution {
    public boolean checkZeroOnes(String s) {
        int ones = 0;
        int zeros = 0;
        int maxone = 0;
        int maxzeros = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '1'){
                maxone++;
                ones = Math.max(maxone , ones);     
            }

            else{
                maxone = 0;

            }
        }

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '0'){
                maxzeros++;
                zeros = Math.max(maxzeros , zeros);     
            }

            else{
                maxzeros = 0;

            }
        }


        return ones > zeros;
    }
}