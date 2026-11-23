class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1)return false;
        boolean[] visited=new boolean[n];
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
        dfs(0,visited,list);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
    public void dfs(int i,boolean[] visited,List<List<Integer>> list){
        visited[i]=true;

        for(int node:list.get(i)){
            if(!visited[node]){
                dfs(node,visited,list);
            }
        }
    }
}
