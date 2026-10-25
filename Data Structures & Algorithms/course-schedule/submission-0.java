class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());

        }
        int[] indegree=new int[numCourses];
        for(int[] p : prerequisites){
            int course=p[0];
            int pre=p[1];
            list.get(pre).add(course);
            indegree[course]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int ind=0;
        while(!q.isEmpty()){
            int course=q.poll();
            ind++;
            for(int next:list.get(course)){
                indegree[next]--;
                if(indegree[next]==0){
                    q.offer(next);
                }
            }
        }
        return ind==numCourses ? true : false ;
    }
}
