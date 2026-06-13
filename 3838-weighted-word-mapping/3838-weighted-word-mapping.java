class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character, Integer> map  = new HashMap<>();
        String str = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            map.put(c , weights[i]);
        }

        System.out.println(map);

        String s = "";

        for(int j = 0 ;  j < words.length ; j++){
            int num = Count(words[j] , map) % 26 ;
            char c = (char)('z' - num);
            s = s + c;

        }


        return s;
    }
    public int Count(String a , HashMap<Character,Integer> map){
        int sum = 0;
        for(int i = 0 ; i < a.length() ; i++){
           int val = map.get(a.charAt(i));
           sum = sum + val;
            
        }

        return sum;

    }
}