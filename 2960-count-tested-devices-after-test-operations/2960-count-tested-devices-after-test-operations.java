class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int ans=0;
        for(int p:batteryPercentages){
           if(p-ans>0)
           ans++;
        }return ans;
    }
}