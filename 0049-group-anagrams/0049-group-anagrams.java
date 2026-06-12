class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String> > map = new HashMap<>();
        List<List<String>> lst = new ArrayList<>();


        for(int i = 0 ; i < strs.length ; i++){
            String s = Sorted(strs[i]);
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
                
            }
            else{
                List<String> m = new ArrayList<>();
                m.add(strs[i]);
                map.put(s , m);
            }
        }

        for(List<String> n : map.values()){
            lst.add(n);
        }

        return lst;
    }

    public String Sorted(String s){
        char[] arr  = s.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }

}