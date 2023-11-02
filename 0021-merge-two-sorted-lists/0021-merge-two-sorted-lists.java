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
        ListNode newNode = new ListNode();
        ListNode header = newNode;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
            ListNode prev = newNode;
            newNode = new ListNode(list1.val);
                //System.out.println("First :"+list1.val);
            prev.next = newNode;           
            list1 = list1.next;
          }else{
                 ListNode prev = newNode;
            newNode = new ListNode(list2.val); 
                // System.out.println("Secound :"+list2.val);
            prev.next = newNode;           
            list2 = list2.next;
            }
        }
        
        if(list1 != null){
            while(list1!=null){
                ListNode remainingNode = new ListNode(list1.val);
            newNode.next = remainingNode;
                newNode = newNode.next;
                list1 = list1.next;
                // System.out.println("Third :"+list1.val);
            }
            
        }
        
         if(list2 != null){
            while(list2!=null){
                ListNode remainingNode = new ListNode(list2.val);
                // System.out.println("FOurth :"+list2.val);
                //System.out.println(newNode.val +"  "+ remainingNode.val);
            newNode.next = remainingNode;
               newNode = newNode.next;
                list2 = list2.next;
            }
            
        }
        
        
        return header.next;
    }
}