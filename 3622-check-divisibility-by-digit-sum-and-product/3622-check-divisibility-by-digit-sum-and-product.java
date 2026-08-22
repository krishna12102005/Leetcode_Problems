class Solution {
    public boolean checkDivisibility(int n) {
        int sum = Sum(n);
        int pro = Product(n);


        int total = sum + pro;

        return n % total == 0 ;
    }

    public int Sum(int n ){
        int sum = 0;
        while(n > 0){
            int last = n % 10;
            sum = sum + last;
            n = n / 10;

        }

        return sum ;
    }

    public int Product(int n){
        int pro = 1;
        while(n > 0){
            int last = n % 10 ;
            pro = pro * last;
            n = n / 10;
        }

        return pro;
    }

}