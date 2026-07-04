class Solution {
    public int maxScore(String s) {
        int max = 0;
        for(int i = 1 ;i < s.length() ; i++){
            int first = left(s.substring(0,i));
            int second = right(s.substring(i));

            int sum = first + second;
            max = Math.max(sum , max);
        }


        return max;
        
    }
    public int left(String s){
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '0'){
                count++;
            }

        }

        return count;
    }

    public int right(String s){
        int count = 0;
        for(int i = 0 ; i< s.length() ; i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }

        return count;
    }
}