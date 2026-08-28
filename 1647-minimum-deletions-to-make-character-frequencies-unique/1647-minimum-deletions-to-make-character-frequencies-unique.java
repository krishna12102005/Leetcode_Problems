class Solution {
    public int minDeletions(String s) {
         HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashSet<Integer> used = new HashSet<>();

        int deletions = 0;

        // Check each frequency
        for (int freq : map.values()) {

            while (freq > 0 && used.contains(freq)) {
                freq--;
                deletions++;
            }

            used.add(freq);
        }

        return deletions;
    }
}