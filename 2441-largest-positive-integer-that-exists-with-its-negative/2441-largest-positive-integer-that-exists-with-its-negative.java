class Solution {
    public int findMaxK(int[] nums){
    

        ArrayList<Integer> lst = new ArrayList<>();

        for(int num :nums){
            lst.add(num);
        }

        ArrayList<Integer> lst2 = new ArrayList<>();

        for(int l : lst){
            if(lst.contains(l) && lst.contains(-l)){
                lst2.add(l);
            }
        }

        int max = -1;
        for(int r : lst2){
            if(r > max){
                max = r;
            }
        }

        return max;
    }
    
}