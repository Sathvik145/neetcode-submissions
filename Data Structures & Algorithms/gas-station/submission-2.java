class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int totalCost=0;
        for(int i=0;i<gas.length;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
        }
        if(totalGas<totalCost)return -1;
        int start=0;
        int tot=0;
        for(int i=0;i<gas.length;i++){
            int diff =(gas[i]-cost[i]);
            tot+=diff;
            if(tot<0){
                start=i+1;
                tot=0;
            }
        }
        if(start==gas.length){
            return 0;
        
        }else{
            return start;
        }
    }
}
