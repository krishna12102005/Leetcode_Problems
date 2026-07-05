class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> que = new LinkedList<>();
        for(int i = 0; i < tickets.length ; i++){
            que.offer(new int[] {i , tickets[i]});
        }

        int time = 0;
        while(!que.isEmpty()){
            int[] person = que.poll();

            person[1]--;
            time++;

            if(person[0] == k && person[1] == 0){
                return time;
            }

            if(person[1] > 0){
                que.offer(person);
            }

        }

        return time;
    }
}