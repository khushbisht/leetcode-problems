class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int xor=0;
       for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            return nums[i];
        } else {
            set.add(nums[i]);
        }
       }
       return -1;
    }
}
    
