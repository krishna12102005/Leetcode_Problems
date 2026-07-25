class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> lst = new ArrayList<>();

        while(n > 0){
            int temp = n % 10;
            lst.add(temp);

            n = n / 10;
        }

        System.out.println(lst);

        for(int i = 0 ; i < lst.size() ; i++){
            for(int j = 0 ; j < lst.size() ; j++){
                if(i != j){
                    int sum = lst.get(i) * lst.get(j);
                    max = Math.max(sum , max);
                }
            }
        }

        return max;
    }
}