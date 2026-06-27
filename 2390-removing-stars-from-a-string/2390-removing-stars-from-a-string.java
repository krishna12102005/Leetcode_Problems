class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c != '*'){
                st.push(c);
            }

            else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }

        String ans = "";

        for(char m : st){
            ans = ans + m;
        }


        return ans;
    }
}