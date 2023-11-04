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
         HashMap<ListNode,Integer> visited = new HashMap<>();
        if(head == null){
            return false;
        }
        
        visited.put(head,1);
        head=head.next;
        while(head!=null){
            
            if(visited.containsKey(head))
                return true;
            else{
                visited.put(head,1);
            }
            
            head = head.next; 
        }
        
        return false;
    }  
}