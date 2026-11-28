class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int lmax=0;
        int rmax=0;
        int ans=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]<lmax){
                    ans+=lmax-height[left];
                }else{
                    lmax=height[left];
                }
                left++;
            }else{
                if(height[right]<rmax){
                    ans+=rmax-height[right];
                }else{
                    rmax=height[right];
                }
                right--;
            }
        }
        return ans;
    }
}
