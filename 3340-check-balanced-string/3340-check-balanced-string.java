class Solution {
    public boolean isBalanced(String num) {
        int even = 0;
        int odd = 0 ;

        // even indices 
        for(int i = 0 ; i < num.length() ; i+=2){
            char c = num.charAt(i);

            even = even + (int)(c - '0');

        }

        for(int i = 1 ; i < num.length() ; i+= 2){
            char c = num.charAt(i);

            odd = odd + (int)(c-'0');
        }

        return even == odd;
    }
}