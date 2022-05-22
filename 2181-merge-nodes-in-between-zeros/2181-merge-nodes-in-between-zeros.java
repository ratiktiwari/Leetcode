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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode first = head;
        ListNode second = head.next;
        int sum=0;
        
        
        while(second!=null){
            
            sum+=second.val;
            
            if(second.val==0){
                first.next.val=sum;
                first=first.next;
                sum=0;
            }
            
            second=second.next;
            
        }
        
        first.next = null;

        return head.next;
    }
}