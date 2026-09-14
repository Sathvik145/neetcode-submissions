class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        solve(nums,used,ans,temp);
        return ans;
    }
    public void solve(int[] nums,boolean[] used,  List<List<Integer>> ans, List<Integer> temp){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            temp.add(nums[i]);
            solve(nums,used,ans,temp);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
}
