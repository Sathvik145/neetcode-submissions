class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Set<Integer> st=new HashSet<>();

        for(int i=0;i<n;i++){
            if(!st.contains(nums[i])){
                st.add(nums[i]);
            }else{
                return true;
            }
        }
        return false;
    }
}