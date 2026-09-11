class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int n=nums.length;
        solve(nums,0,n,ans,temp);
        return ans;
    }
    public void solve(int[] nums,int ind,int n,List<List<Integer>> ans,List<Integer> temp){
        if(ind==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        int take=nums[ind];
        temp.add(take);
        solve(nums,ind+1,n,ans,temp);

        temp.remove(temp.size()-1);

        solve(nums,ind+1,n,ans,temp);

        

    }
}
