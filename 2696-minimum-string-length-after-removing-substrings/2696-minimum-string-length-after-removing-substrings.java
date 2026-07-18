class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0  ;i < s.length()  ; i++){
            char c = s.charAt(i);

            if(st.isEmpty()){
                st.push(c);
            }
            else{
               char top = st.peek();
               String action = "" + top + c;
               if(action .equals("AB")  || action .equals("CD") ){
                 st.pop();
               }
               else{
                st.push(c);
               }
            }
        }

        System.out.println(st);

        return st.size();

    }
}