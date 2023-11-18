/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        LinkedList<ListNode> lists = new LinkedList<>();
        ListNode current = headA;
        while(current != null){
            lists.add(current);
            current = current.next;
        }
        current = headB;
        while(current!=null){
            if(lists.contains(current)){
                return current;
            }else
 current = current.next;
        }
        
        return null;
    }
    
}