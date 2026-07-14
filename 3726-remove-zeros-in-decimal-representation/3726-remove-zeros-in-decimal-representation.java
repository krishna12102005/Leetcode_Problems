class Solution {
    public long removeZeros(long n) {
        String str = n + "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != '0'){
                sb.append(str.charAt(i));
                
            }
        }

        long ans = Long.parseLong(sb.toString());

        return ans;
        
    }
}