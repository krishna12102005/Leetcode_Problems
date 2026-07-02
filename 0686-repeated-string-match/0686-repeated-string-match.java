class Solution {
    public int repeatedStringMatch(String a, String b) {
       StringBuilder sb = new StringBuilder();
        int count = 0;

        // Keep repeating until the length becomes at least b.length()
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        // Check if b is present
        if (sb.indexOf(b) != -1) {
            return count;
        }

        // One more repeat to handle overlap
        sb.append(a);
        count++;

        if (sb.indexOf(b) != -1) {
            return count;
        }

        return -1;
        
    }
}