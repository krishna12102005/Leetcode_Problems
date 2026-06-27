class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();


        for(int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c != '#'){
                st1.push(c);
            }
            else{
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
        }

         for(int i = 0; i < t.length() ; i++){
            char c = t.charAt(i);
            if(c != '#'){
                st2.push(c);
            }
            else{
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
        }

        String str = "";
        String ans = "";

        for(char m : st1){
            str = str + m;
        }

        for(char r : st2){
            ans = ans + r;
        }


        return str.equals(ans);



        
    }
}