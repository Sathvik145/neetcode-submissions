class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(nums,0,target,ans,temp);
        return ans;
    }

    public void solve(int[] nums,int ind,int target,List<List<Integer>> ans,List<Integer> temp){
        if(target==0 ){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(ind==nums.length || target<0)return;
        int take=nums[ind];
        temp.add(take);
        solve(nums,ind,target-nums[ind],ans,temp);

        temp.remove(temp.size()-1);

        solve(nums,ind+1,target,ans,temp);
    }
}
