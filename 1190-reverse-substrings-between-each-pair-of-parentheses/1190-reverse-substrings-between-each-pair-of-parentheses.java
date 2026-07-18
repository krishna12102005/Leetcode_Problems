class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            

            if(c != ')'){
                st.push(c);
            }

            else{
                StringBuilder sb = new StringBuilder();
               
                    while(st.peek() != '('){
                         sb.append(st.pop());
                    }


                    st.pop();

                    for(char m : sb.toString().toCharArray()){
                            st.push(m);
                    }
                   
            }
        }



        StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.reverse().toString();

        
    }
}