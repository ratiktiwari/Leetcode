public class LL6 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){

            if(a==null){
                a=headB;
                continue;
            }
            if(b==null){
                b=headA;
                continue;
            }

            a=a.next;
            b=b.next;

        }

        return a;
    }

}
