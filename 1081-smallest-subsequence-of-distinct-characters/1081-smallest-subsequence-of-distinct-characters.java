class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();

        // Last occurrence of every character
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;
        }

        boolean[] visited = new boolean[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Already present in our answer
            if (visited[ch - 'a']) {
                continue;
            }

            // Remove bigger characters if
            // they are available again in the future
            while (!st.isEmpty()
                    && st.peek() > ch
                    && arr[st.peek() - 'a'] > i) {

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