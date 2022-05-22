public class LL10 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  //recursive reverse
//  public ListNode reverse(ListNode head){
//
//        if(head==null || head.next==null){
//            return head;
//        }
//
//        ListNode newHead = reverse(head.next);
//
//        head.next.next = head;
//        head.next = null;
//
//
//        return newHead;
//
//  }

  //iterative reverse

    public ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode temp = null;

        while(head!=null){
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;

    }

    public int pairSum(ListNode head) {

        if(head.next.next==null){
            return head.val+head.next.val;
        }

        //finding mid
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode reverseHead = reverse(slow);

        ListNode temp = head;

        int max = 0;

        while(reverseHead!=null){
            if(temp.val+reverseHead.val>max){
                max = temp.val + reverseHead.val;
            }

            temp=temp.next;
            reverseHead=reverseHead.next;
        }

        return max;


    }

}
