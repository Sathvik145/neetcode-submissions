class Solution {
    public void rotate(int[][] matrix) {
        solve(matrix);
        solve1(matrix);
        return;
    }
    public void solve(int[][] matrix){
        int  m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m-1;i++){
            for(int j=0;j<n-i-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]= matrix[m-1-j][n-1-i];
                matrix[m-1-j][n-1-i]=temp;

            }
        }
        return;
    }
    public void solve1(int[][] matrix){
         int  m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m/2;i++){
            for(int j=0;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[m-1-i][j];
                matrix[m-1-i][j]=temp;
            }
        }
        return;
    }
}
