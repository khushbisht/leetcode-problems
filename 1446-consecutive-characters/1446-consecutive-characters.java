class Solution {
    public int maxPower(String s) {
        int max = 1;
        for(int i=0;i<s.length();i++){
            int count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            max=Math.max(max,count);
        }   
        return max;
    }
}