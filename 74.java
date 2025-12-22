class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m =matrix.length;
        boolean flag=false;
        for(int i=m-1;i>=0;i--){
            int n= matrix[i].length;
            if(matrix[i][0]<=target && matrix[i][n-1]>=target){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==target){
                        flag=true;
                        break;
                    }
                }
            }
        }
        return flag;
    }
}