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
        
        if (head.next == null) {
            return null;
        }

        ListNode iterator = head;
        ListNode newList = new ListNode(0);
        ListNode newTemp = newList;

        int sum = 0;

        while (iterator != null) {
            sum += iterator.val;

            if (iterator.val == 0) {
                if (sum != 0) {
                    newTemp.next = new ListNode(sum);
                    newTemp=newTemp.next;
                }
                sum = 0;
            }
            iterator = iterator.next;

        }

        return newList.next;
    }
}