class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:hand){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        Arrays.sort(hand);
        int i=0;
        while(map.size()>0){
            if(!map.containsKey(hand[i])){
                i++;
                continue;
            }
            for(int j=0;j<groupSize;j++){
                int temp=hand[i]+j;
                if(!map.containsKey(temp)){
                    return false;
                }else{
                    map.put(temp,map.get(temp)-1);
                    if(map.get(temp)==0)map.remove(temp);
                }
            }
            i++;
        }
        return true;
    }
}
