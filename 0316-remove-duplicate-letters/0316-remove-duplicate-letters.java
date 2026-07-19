class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();

       
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;
        }

        boolean[] visited = new boolean[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            
            if (visited[ch - 'a']) {
                continue;
            }

        
            while (!st.isEmpty() && st.peek() > ch && arr[st.peek() - 'a'] > i) {
                char removed = st.pop();
                visited[removed - 'a'] = false;
            }

            st.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : st) {
            sb.append(ch);
        }

        return sb.toString();
    }
}