/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n=intervals.size();
        int[] start=new int[n];
        int[] end=new int[n];

        for(int i=0;i<n;i++){
            start[i]=intervals.get(i).start;
            end[i]=intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int ans=0;
        int ei=0;
        for(int si=0;si<n;si++){
            if(start[si]<end[ei]){
                ans++;
            }else{
                ei++;
            }
        }
        return ans;
    }
}
