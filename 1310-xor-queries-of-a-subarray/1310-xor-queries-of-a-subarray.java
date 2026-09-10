class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXor = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            prefixXor[i + 1] = prefixXor[i] ^ arr[i];
        }

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            answer[i] = prefixXor[right + 1] ^ prefixXor[left];//
        }
        return answer;
    }
}
