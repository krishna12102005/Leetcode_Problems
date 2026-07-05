class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int noteat = 0;
        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int i : students){
            que.offer(i);
        }

        for(int j = sandwiches.length-1 ; j >= 0 ; j--){
            st.push(sandwiches[j]);
        }

        while(!que.isEmpty() && !st.isEmpty() && noteat < que.size()){
            int stu = que.poll();
            int food = st.peek();

            if(stu == food){
                st.pop();
                noteat = 0;
            }

            else{
                que.offer(stu);
                noteat++;
            }
        }

        return que.size();

    }
}