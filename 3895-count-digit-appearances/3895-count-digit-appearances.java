class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        int count = 0;
        String str = sb.toString();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.forDigit(digit, 10)) {
                count++;
            }
        }
        return count;
    }
}