class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int sec = -1;

        for(int i = 0 ;i < s.length() ; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int a = c - '0';
                if(a > max){
                    sec = max;
                    max = a;
                }

                else if(a > sec && a != max){
                    sec = a;
                }
            }
        }

        return sec;
        
    }
}