class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++){
        map.put(s.charAt(i),i);

      }
      int size=0;
      int max=0;
      List<Integer> ans=new ArrayList<>();

      for(int i=0;i<n;i++){
        max=Math.max(max,map.get(s.charAt(i)));
        size++;
        if(i==max){
            ans.add(size);
            size=0;
        }
      }
      return ans;

    }
}
