class Solution {
    public long sumAndMultiply(int n) {
        String x = String.valueOf(n);

        StringBuilder sb = new StringBuilder();
        long sum = 0;

        for(int i = 0 ; i < x.length() ; i++){
            if(x.charAt(i) != '0'){
                sb = sb .append(x.charAt(i));
                sum = sum + x.charAt(i) - '0';
            }
        }

        if(sb.length() == 0){
            return  0;
        }

        long con = Long.parseLong(sb.toString());

        long ans = con * sum ;

        return ans;
        
    }
}