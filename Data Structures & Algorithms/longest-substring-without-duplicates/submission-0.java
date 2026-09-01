class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int n=s.length();
        int ans=0;
        while(r<n){
            char x=s.charAt(r);
            if(map.containsKey(x)){
                l=Math.max(l,map.get(x)+1);
            }
                map.put(x,r);
            
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}
