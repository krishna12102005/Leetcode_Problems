class Solution {
    public int maxProduct(int[] arr) {
         Arrays.sort(arr);
         int a = arr[arr.length-1];
         int b = arr[arr.length -2];


         return (a -1 ) * (b -1);
    }
}