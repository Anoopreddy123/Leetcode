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
    public ListNode deleteMiddle(ListNode head) {
     
        int count = 0;
        ListNode temp = head;
        while( temp != null){
            temp = temp.next;
            count++;
            
        }
        
        if(head == null || head.next == null){
            return null;
        }
        
        int mid = count/2;
        //System.out.print(mid);
        count = 0;
        temp = head;
        while( count < mid - 1){
            temp = temp.next;
            count++;
        } 
        
        temp.next = temp.next.next;
        
        
        return head;
        
        
    }
}