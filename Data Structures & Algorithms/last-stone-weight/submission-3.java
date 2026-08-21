class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones){
            pq.offer(x);
        }
        while(pq.size()>1){
            int x=pq.peek();
            pq.poll();
            int y=pq.peek();
            pq.poll();
            if(x==y){
                continue;
            }else{
                pq.offer(Math.abs(x-y));
            }
        }
        return pq.isEmpty()? 0:pq.peek();
    }
}
