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
    public ListNode reverseList(ListNode head){

        if(head==null || head.next==null){
            return head;
        }

        ListNode newHead = reverseList(head.next);

        head.next.next = head;
        head.next=null;

        return newHead;
    }
    
    public boolean isPalindrome(ListNode head) {
        
      ListNode slow=head;
      ListNode fast=head;
      
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;        
      }
      
      ListNode reverseHead = reverseList(slow);
      
      ListNode temp = head;
      
      while(temp!=slow){
          if(temp.val!= reverseHead.val){
              return false;
          }
          temp=temp.next;
          reverseHead=reverseHead.next;
      }
      
      return true;
        
    }
}