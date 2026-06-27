class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
             if(Character.isDigit(c)){
                if(!st.isEmpty()){
                    st.pop();
                }
             }

             else{
                st.push(c);
             }
        }

        StringBuilder sb = new StringBuilder();
        for(char m : st){
            sb.append(m);
        }


        return new String(sb);
    }
}