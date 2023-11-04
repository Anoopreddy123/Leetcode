/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         ArrayList<ListNode> visited = new ArrayList<>();
        if(head == null){
            return false;
        }
        
        visited.add(head);
        head=head.next;
        while(head!=null){
            
            if(visited.contains(head))
                return true;
            else{
                visited.add(head);
            }
            
            head = head.next; 
        }
        
        return false;
    }  
}