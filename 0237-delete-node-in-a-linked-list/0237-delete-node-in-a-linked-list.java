/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       ListNode current = node;
    ListNode duplicate = current.next;
        current.val = duplicate.val;
        current.next = current.next.next;
    }
}