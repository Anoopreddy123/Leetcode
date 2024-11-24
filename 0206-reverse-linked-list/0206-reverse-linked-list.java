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
    public ListNode reverseList(ListNode head) {
        
        // Reverse the linkedlist
        // Head as input
        // Brute force - store val in list and update the nodes in iterative way.
        // return the new list i.e head of the new revrse linked list
        
        // prev, curr, nextNode:
        // prev = 1, curr = 2, next = 3
        // next.next == null
        
        if(head == null){
            return head;
        }
        
        ListNode prev =  null;
        ListNode currNode = head;
        ListNode nextNode = head.next;
        
        // null     1  -     2    
        // prev - curr - nextnode
        //
        
        while(nextNode != null){
             prev = currNode;
            currNode = nextNode;
             nextNode = nextNode.next;

            currNode.next = prev;    
           
            
        }
        head.next = null;
        
        currNode.next = prev;
        
        return currNode;
        
    }
}