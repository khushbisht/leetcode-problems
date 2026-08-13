class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        double avg = Double.MAX_VALUE;
        while (left < right) {
            avg = Math.min(avg, (double) (nums[left] + nums[right]) / 2);
            left++;
            right--;
        }
        return avg;
    }
}