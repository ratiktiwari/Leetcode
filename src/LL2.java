public class LL2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {

//        ListNode temp = head;
//        if(head.next==null){ //only one node
//            return head;
//        }
//        ListNode i =head;
//        if(head.next.next==null){
//            return i.next;
//        }
//        ListNode j = head.next.next;
//
//        while(i!=null && j!=null){
//            i=i.next;
//            if(j.next!=null){
//                j=j.next.next;
//            }
//            else{
//                return i;
//            }
//        }
//        return i.next;





        //same strategy as above but less code lines

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
