class Solution {
    public int removeDuplicates(int[] nums) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                for(int j=i+1;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }

                i--;
                nums[nums.length-1]=Integer.MAX_VALUE;

            }

        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=Integer.MAX_VALUE){
                count++;
            }
        }
        return count;
        
    }
}