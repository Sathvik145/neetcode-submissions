class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(mp.containsKey(key)){
                mp.get(key).add(s);
            }else{
                List<String> temp=new ArrayList<>();
                temp.add(s);
                mp.put(key,temp);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> lt:mp.values()){
            ans.add(lt);
        }
    return ans;
    }
}
