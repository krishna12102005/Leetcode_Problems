class Solution {
    public int smallestNumber(int n, int t) {
        int number = 0;
        for(int i = n ; i <=300  ; i++){
             int pro = FindProduct(i);
             if(pro % t == 0){
                number = i;
                break;
             }
        }

        return number;

    }
    public int FindProduct(int n ){
        int pro = 1;

        while(n > 0){
            int last = n % 10 ;
            pro = pro * last;
            n = n / 10;
        }

        return pro;
    }
}