class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            
            if(!st.isEmpty() && Character.isUpperCase(c) ){
                char m = Character.toLowerCase(c);
                if(m == st.peek()){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
            else if(!st.isEmpty() && Character.isLowerCase(c)){
                char r = Character.toUpperCase(c);
                if(r == st.peek()){
                    st.pop();
                }
                else{
                    st.push(c);
                }

            }

            else{
                st.push(c);
            }

        
        }

        System.out.println(st);

        StringBuilder sb = new StringBuilder();
        for(char r : st){
            sb.append(r);
        }


        return new String(sb);

    }
}