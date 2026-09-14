class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,0,target,ans,temp);
        
        return ans;
    }

    public void solve(int[] candidates, int ind,int target, List<List<Integer>> ans,List<Integer> temp ){
        if(target==0){
         List<Integer> x=new ArrayList<>(temp);
         
         ans.add(x);
         return;
        }

        if(ind==candidates.length || target<0){
            return;
        }
        
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i-1]==candidates[i]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            temp.add(candidates[i]);
            solve(candidates,i+1,target-candidates[i],ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}
