class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedSet = new HashSet<>();
        for (int i=0;i<allowed.length();i++) {
            allowedSet.add(allowed.charAt(i));
        }
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (int i=0;i<word.length();i++) {
                if (!allowedSet.contains(word.charAt(i))) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }
        return count;
    }
}