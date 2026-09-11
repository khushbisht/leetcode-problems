class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            Arrays.sort(grid[i]);
        }
        int sum=0;
        for (int i = 0; i < c; i++) {
            int max = 0;
            for (int j = 0; j < r; j++) {
                max = Math.max(max, grid[j][c - 1 - i]);
            }
            sum += max;
        }
        return sum;
    }
}