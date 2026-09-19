class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] even = new int[nums.length];
        int evenIndex = 0;
        int[] odd = new int[nums.length];
        int oddIndex = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                even[evenIndex++] = num;
            } else {
                odd[oddIndex++] = num;
            }
        }
        int[] result = new int[nums.length];
        System.arraycopy(even, 0, result, 0, evenIndex);
        System.arraycopy(odd, 0, result, evenIndex, oddIndex);
        return result;
        
    }
}
