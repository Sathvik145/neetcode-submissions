class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;

        boolean[][] pacific=new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for(int c=0;c<n;c++){
            dfs(heights,pacific,0,c);
            dfs(heights,atlantic,m-1,c);
        }
        for(int r=0;r<m;r++){
            dfs(heights,pacific,r,0);
            dfs(heights,atlantic,r,n-1);
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j]== true && atlantic[i][j]==true){
                    
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }
    public void dfs(int[][] heights,boolean[][] visited,int i,int j){
        int m=heights.length;
        int n=heights[0].length;

        if(visited[i][j]){
            return;
        }
        visited[i][j]=true;
        int[][] dirs={{1,0},{0,1},{-1,0},{0,-1}};
        for(int[] d:dirs){
            int nr=i+d[0];
            int nc=j+d[1];

            if(nr<m && nc<n && nr>=0 && nc>=0 && heights[nr][nc]>= heights[i][j]){
                dfs(heights,visited,nr,nc);
            }
        }
        
    }
}
