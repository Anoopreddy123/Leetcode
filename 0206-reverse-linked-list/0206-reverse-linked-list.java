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
        
        if(head == null){
            return head;
        }
        
        
        ListNode past = null, present = head, future = head.next;
        
        
        while( future!= null){
             present.next = past;
            past = present;
          present = future;
            future = future.next;
            
           
            
        }
        
        present.next = past;
        
        return present;
        
    }
}