/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q=new PriorityQueue<>(
            (a,b)-> a.val-b.val
        );
        for(ListNode node:lists){
            if(node!=null){
                q.offer(node);
            }
        }

        ListNode head=new ListNode(0);
        ListNode dummy=head;

        while(!q.isEmpty()){
            ListNode node=q.poll();
            dummy.next=node;
            dummy=dummy.next;
            if(node.next!=null){
                q.offer(node.next);
                node=node.next;
            }
        }
        dummy.next=null;
        return head.next;
    }
}
