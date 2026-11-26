class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int temp=solve(i,j,matrix,dp);
                ans=Math.max(ans,temp);
            }
        }
        return ans;
    }
    public int solve(int i,int j,int[][] matrix,int[][] dp){
        int m=matrix.length;
        int n=matrix[0].length;
        if(i<0 || j<0 || i>=m || j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        int t=1;
        for(int[] d:dirs){
            int nr=i+d[0];
            int nc=j+d[1];

            if(nr>=0 && nc>=0 && nr<m && nc<n && matrix[nr][nc]>matrix[i][j]){
               t = Math.max(t, 1 + solve(nr,nc,matrix,dp));
            }
        }
        return dp[i][j]=t;
    }
}
