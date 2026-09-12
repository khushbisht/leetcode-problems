class Solution {
    public int maximumCount(int[] nums) {
        int cp = 0;
        int cn=0;
        for (int num : nums) {
            if (num < 0) {
                cn++;
            }
            if (num > 0) {
                cp++;
            }
        }
        return Math.max(cp,cn);
    }
}