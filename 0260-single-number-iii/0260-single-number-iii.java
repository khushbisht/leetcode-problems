class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int diffBit = xor & (-xor);// Get the rightmost set bit
        for (int num : nums) {
            if ((num & diffBit) == 0){
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;
    }
}