class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(nums,0,temp,ans);
        return ans;
    }
    public void solve(int[] nums,int ind,  List<Integer> temp , List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++){
            temp.add(nums[i]);
            solve(nums,i+1,temp,ans);
            temp.remove(temp.size()-1);

        }
    }
}
