class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        // Start from the last digit and work backward
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, set it to 0 (carry over to the next)
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;  // e.g., 999 + 1 = 1000
        return result;        

    }
}