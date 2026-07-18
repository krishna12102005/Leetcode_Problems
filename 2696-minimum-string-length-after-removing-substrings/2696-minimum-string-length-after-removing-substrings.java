class Solution {
    public int minLength(String s) {
        
        while(true){
            String next = s.replace("AB" , "").replace("CD" , "");

            if(next.equals(s)){
                break;
            }

            s = next;
        }

        return s.length();

        

    }
}