class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==(s.charAt(s.length()-1-i))){
                continue;
            }
            else if(s.charAt(i)>s.charAt(s.length()-1-i)){
                sb.setCharAt(i, s.charAt(s.length()-1-i));
            }
            else if(s.charAt(i)<s.charAt(s.length()-1-i)){
                sb.setCharAt(i, s.charAt(i));
            }
        }
        return sb.toString();

    }
}