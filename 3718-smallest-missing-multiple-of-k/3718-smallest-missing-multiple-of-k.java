class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= 1000; i++) {
            if (i % k == 0 && !set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}