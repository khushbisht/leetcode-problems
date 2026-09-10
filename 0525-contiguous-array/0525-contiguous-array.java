class Solution {
    public int findMaxLength(int[] nums) {
        int k = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
               k--;}
            else{
           k++;}

            if(map.containsKey(k)){
                max = Math.max(max, i - map.get(k));
            }
            else
            map.put(k,i);
        }
        return max;
    }
}