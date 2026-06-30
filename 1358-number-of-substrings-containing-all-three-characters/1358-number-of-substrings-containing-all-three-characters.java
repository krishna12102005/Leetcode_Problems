class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = {-1, -1, -1}; // a, b, c
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // Update the last seen index of the current character
            lastSeen[s.charAt(i) - 'a'] = i;

            // Check if all three characters have been seen
            if (lastSeen[0] != -1 &&
                lastSeen[1] != -1 &&
                lastSeen[2] != -1) {

                count += 1 + Math.min(
                                lastSeen[0],
                                Math.min(lastSeen[1], lastSeen[2])
                          );
            }
        }

        return count;
    }
}