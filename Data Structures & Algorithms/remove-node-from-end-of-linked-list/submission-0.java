class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode curr = head;

        // Count nodes
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        // Remove head
        if (n == count) {
            return head.next;
        }

        // Find node before the target
        int steps = count - n - 1;

        ListNode dum = head;

        for (int i = 0; i < steps; i++) {
            dum = dum.next;
        }

        // Remove target
        dum.next = dum.next.next;

        return head;
    }
}