class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1) Count length
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }

        // 2) If removing the head
        if (len == n) {
            return head.next; // not nulling the entire list
        }

        // 3) Find the node just before the one to delete: index = len - n - 1
        int steps = len - n - 1;
        cur = head;
        for (int i = 0; i < steps; i++) cur = cur.next;

        // 4) Bypass the target node
        cur.next = cur.next.next;
        return head;
    }
}