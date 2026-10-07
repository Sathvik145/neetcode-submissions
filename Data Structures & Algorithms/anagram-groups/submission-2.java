class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            char[] s=strs[i].toCharArray();
            Arrays.sort(s);
            String ss=new String(s);
            if(map.containsKey(ss)){
                map.get(ss).add(strs[i]);
            }else{
                List<String> temp=new ArrayList<>();
                temp.add(strs[i]);
                map.put(ss,temp);
            }
        }

        return new ArrayList<>(map.values());
    }
}
