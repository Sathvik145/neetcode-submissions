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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(-1);
        ListNode dummy=head;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ListNode temp=new ListNode(list1.val);
                dummy.next=temp;
                list1=list1.next;
            }else{
                ListNode temp2=new ListNode(list2.val);
                dummy.next=temp2;
                list2=list2.next;
            }
            dummy=dummy.next;
        }
        if(list1!=null){
            dummy.next=list1;
        }
        if(list2!=null){
            dummy.next=list2;
        }
        return head.next;
    }
}