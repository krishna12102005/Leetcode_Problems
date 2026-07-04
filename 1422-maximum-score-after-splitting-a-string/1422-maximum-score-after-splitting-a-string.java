class Solution {
    public int maxScore(String s) {
        int max = 0;
        int totalOnes = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1'){
                totalOnes++;
            }
        }

        int leftzeros = 0;

        for(int i = 0 ; i < s.length()-1 ; i++){
            if(s.charAt(i) == '0'){
                leftzeros++;
            }
            else{
                totalOnes--;
            }

            max = Math.max(max , leftzeros + totalOnes);
            
        }

        return max;

    }
}