class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        
        int left=0;
        int right=n-1;
        int maxA=0;
        while(left<right){
            int h=Math.min(heights[left],heights[right]);
            int w=(right-left);
            maxA=Math.max(maxA,h*w);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxA;
    }
}
