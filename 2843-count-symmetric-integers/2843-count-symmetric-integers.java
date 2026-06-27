class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low ; i <= high ; i++){
                int[] arr =  ConvertArray(i);

                if(arr.length % 2 == 0){
                    int mid = arr.length / 2;
                    int[] left = Arrays.copyOfRange(arr , 0 , mid);
                    int[] right = Arrays.copyOfRange(arr , mid , arr.length);

                    if(sumOfArray(left , right)){
                           count++;
                    }

                }
                

            

        }

        return count ;
        
    }
    public static boolean sumOfArray(int[] arr1 , int[] arr2){
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0 ; i < arr1.length ; i++){
            sum1 = sum1 + arr1[i];
        }

        for(int i = 0 ; i < arr2.length  ; i++){
            sum2 = sum2 + arr2[i];
        }


        return sum1 == sum2;
    }

    public static int[]  ConvertArray(int n){

        String str = Integer.toString(n);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
        arr[i] = str.charAt(i) - '0';

        }

        return arr;
    }
}