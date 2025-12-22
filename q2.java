class Solution {
    public int toBinary(int num){
        int binary=0,place=1;
        while(num>0){
            int rem=num%2;
            binary=binary+rem*place;
            place=place*10;
            num=num/2;
        }
        int rev=0,original=binary;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
    public int[] minOperations(int[] nums) {
        int ans[]=new int[nums.length];
        ans[0]=0;
        for(int i=1;i<nums.length;i++){
            int count=0;
            ans[i]=count;
        }
        return ans;
    }
}
sak