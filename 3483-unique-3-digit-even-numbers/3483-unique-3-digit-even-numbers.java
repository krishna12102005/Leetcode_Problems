class Solution {
    public static int totalNumbers(int[] digits) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                    if (i != j && i != k && j != k) {

                        // First digit cannot be 0
                        if (digits[i] == 0) {
                            continue;
                        }

                        // Last digit must be even
                        if (digits[k] % 2 != 0) {
                            continue;
                        }

                        int num = digits[i] * 100
                                + digits[j] * 10
                                + digits[k];

                        numbers.add(num);
                    }
                }
            }
        }

        return numbers.size();
    }
}