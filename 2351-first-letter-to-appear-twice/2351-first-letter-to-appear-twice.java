class Solution {
    public char repeatedCharacter(String s) {
        List<Character> lst = new ArrayList<>();
        for(int i = 0; i < s.length() ; i++){
            if(lst.contains(s.charAt(i))){
                return s.charAt(i);
            }

            else{
                lst.add(s.charAt(i));
            }
        }

        return ' ';
    }
}