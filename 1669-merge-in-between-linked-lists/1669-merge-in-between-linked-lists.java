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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode temp1 = list1;
        int count = 0;

        while (count != b) {
            if (count == a - 1) {
                ListNode localTemp = temp1.next;
                temp1.next = list2;
                temp1 = localTemp;
                count++;
            } else {
                temp1 = temp1.next;
                count++;
            }
        }

        while (list2.next != null) {
            list2 = list2.next;
        }

        list2.next = temp1.next;


        return list1;
        
        
    }
}