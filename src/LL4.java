public class LL4 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseList(ListNode head) {

        if(head == null || head.next==null){
            return head;
        }

        ListNode i = head;
        ListNode j = head.next;
        ListNode temp = null;

        while(j!=null){
            i.next = temp;
            temp=i;
            i = j;
            j=j.next;
        }

        i.next=temp;
        return i;

    }

}
