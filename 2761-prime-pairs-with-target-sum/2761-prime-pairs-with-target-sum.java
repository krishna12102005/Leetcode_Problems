class Solution {
    public List<List<Integer>> findPrimePairs(int n) {

        boolean[] prime = new boolean[n+1];

        for(int i = 2 ; i < n ; i++){
            prime[i] = true;
        }

        for(int i = 2 ; i * i < n ; i++){
            if(prime[i]){
                for(int j = i * i ; j <= n ; j= j + i){
                    prime[j] = false;
                }

            }
        }

        Set<Integer> set  = new HashSet<>();
        int count = 0;
        for(int i = 2 ; i < n ; i++){
             if(prime[i]){
                set.add(i);
                
             }
        }

        List<List<Integer>> lst = new ArrayList<>();


     
        for(int i = 1 ; i <= n / 2; i++){
           
            int sum = n - i;
            if(set.contains(sum) && set.contains(i) ){
                List<Integer> off = new ArrayList<>();
                off.add(i );
                off.add(sum);

                lst.add(off);
                
            }

            
        }     


        return lst;        
        
    }
}