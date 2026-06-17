class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        char[] arr2  = s.toCharArray();

        for(int i = 0 ; i  < arr2.length ; i++){
            String l = "";
            for(int j = i ; j < arr2.length ; j++){
                l = l + arr2[j];
                boolean itis = IsPalindrome(l);
                if(itis){
                    count++;

                }
                
            }

        }


        return count;
        
    }

    public boolean IsPalindrome(String s){
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr).equals(s);
    }
}