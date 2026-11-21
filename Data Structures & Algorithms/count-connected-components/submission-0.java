class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[] visited=new boolean[n];
        int ans=0;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];

            list.get(u).add(v);
            list.get(v).add(u);
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                ans++;
                dfs(i,list,visited);
            }
        }
        return ans;
    }
    public void dfs(int i,List<List<Integer>> list,boolean[] visited){
        visited[i]=true;
        for(int x:list.get(i)){
            if(!visited[x]){
                dfs(x,list,visited);
            }
        }
        return;
    }
}
