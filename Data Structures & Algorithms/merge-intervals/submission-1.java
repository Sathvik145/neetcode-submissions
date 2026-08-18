class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> (a[0]-b[0]));

        ans.add(intervals[0]);
        int i=1;
        while(i<n){
            int x=ans.size()-1;
            if(ans.get(x)[1]>= intervals[i][0]){
                ans.get(x)[0]=Math.min(ans.get(x)[0],intervals[i][0]);
                ans.get(x)[1]=Math.max(ans.get(x)[1],intervals[i][1]);
            }else{
                ans.add(intervals[i]);
            }
            i++;
        }
        return ans.toArray(new int[ans.size()][]);

    }
}
