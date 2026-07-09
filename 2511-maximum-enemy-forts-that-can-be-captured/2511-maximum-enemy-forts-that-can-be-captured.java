class Solution {
    public int captureForts(int[] forts) {
        int max = 0;
        int last = -1; // Index of the last non-zero element

        for (int i = 0; i < forts.length; i++) {

            if (forts[i] != 0) {

                if (last != -1 && forts[last] != forts[i]) {
                    max = Math.max(max, i - last - 1);
                }

                last = i;
            }
        }

        return max;
    }
}