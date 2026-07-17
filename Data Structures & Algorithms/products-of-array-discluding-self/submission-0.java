class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prep=new int[n];
        prep[0]=1;
        int[] sufp=new int[n];
        sufp[n-1]=1;
        for(int i=1;i<n;i++){
            prep[i]=nums[i-1]*prep[i-1];

            sufp[n-1-i]=nums[n-i]*sufp[n-i];
        }

        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=prep[i]*sufp[i];
        }
        return ans;
    }
}  
