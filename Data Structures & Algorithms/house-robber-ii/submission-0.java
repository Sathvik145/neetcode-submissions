class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1)return nums[0];

        int[] dp1=new int[n];
        Arrays.fill(dp1,-1);

        int[] dp2=new int[n];
        Arrays.fill(dp2,-1);

        int ans1=solve(nums,0,n-2,dp1);
        int ans2=solve(nums,1,n-1,dp2);

        return Math.max(ans1,ans2);
    }
    public int solve(int[] nums,int i,int j,int[] dp){
        if(i>j)return 0;

        if(dp[i]!=-1){
            return dp[i];
        }
        int take=nums[i]+solve(nums,i+2,j,dp);
        int skip=solve(nums,i+1,j,dp);

        return dp[i]=Math.max(take,skip);
    }
}
