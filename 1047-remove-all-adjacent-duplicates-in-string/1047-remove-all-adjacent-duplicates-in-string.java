class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0  ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(st.isEmpty()){
                st.push(c);
            }
            else{
                if(!st.isEmpty()){
                char m = st.peek();
                if(m == c){
                st.pop();
                }
                else{
                st.push(c);
                }
            }

            }

           
        
        }

        StringBuilder sb = new StringBuilder();
        for(char r : st){
            sb.append(r);
        }

        return new String(sb);
    }
}