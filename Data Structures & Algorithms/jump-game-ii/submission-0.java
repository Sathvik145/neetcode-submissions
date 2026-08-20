class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int maxEnd=0;
        int currEnd=0;
        int ans=0;
        for(int i=0;i<n-1;i++){
            
            maxEnd=Math.max(maxEnd,i+nums[i]);
            if(currEnd==i){
                ans++;
                currEnd=maxEnd;
            }
            
        }
        return ans;
    }
}
