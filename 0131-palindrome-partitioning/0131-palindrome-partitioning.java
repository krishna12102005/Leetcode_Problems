class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();

        Party(s , 0 , ans , path);

        return ans;

    }
    public void Party(String s , int index , List<List<String>> ans , List<String> path){
        if(index == s.length()){
            ans.add(new ArrayList<>(path));
            return ;
        }

        for(int i = index ; i < s.length() ; i++){
            if(Palindrome(s , index , i)){
                path.add(s.substring(index , i+1));
                Party(s , i+1 , ans , path);
                path.remove(path.size() - 1);
            }
        }

    }
    public boolean Palindrome(String s , int start , int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return  false;
            }

            start++;
            end--;
        }

        return  true;
    }
}