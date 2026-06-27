class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count= 0;
        for(int i = low ; i <= high ; i++){
            String str = String.valueOf(i);


            if(str.length() % 2 == 0){
                int first = 0;
                int second = 0;

                int mid = str.length() / 2;

                for(int j = 0 ; j < mid ; j++){
                    first = first + str.charAt(j) - '0';
                }

                for(int k = mid ; k < str.length() ; k++){
                    second = second + str.charAt(k) - '0';
                }


                if(first == second){
                    count++;
                }

            }
        }


        return count;
    }
}