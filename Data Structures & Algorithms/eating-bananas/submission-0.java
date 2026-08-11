class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int x:piles){
            max=Math.max(max,x);
        }
        int low=1;
        int high=max;
        while(low<=high){
            int k=low+(high-low)/2;
            int hours=0;
            for(int x:piles){
                hours+=(x+k-1)/k;
            }
            if(hours<=h){
                high=k-1;

            }else{
                low=k+1;
            }
        }
        return low;
    }
}
