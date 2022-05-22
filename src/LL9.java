public class LL9 {

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

    public ListNode mergeNodes(ListNode head) {


//        if (head.next == null) {
//            return null;
//        }
//
//        ListNode iterator = head;
//        ListNode newList = new ListNode(0);
//        ListNode newTemp = newList;
//
//        int sum = 0;
//
//        while (iterator != null) {
//            sum += iterator.val;
//
//            if (iterator.val == 0) {
//                if (sum != 0) {
//                    newTemp.next = new ListNode(sum);
//                    newTemp=newTemp.next;
//                }
//                sum = 0;
//            }
//            iterator = iterator.next;
//
//        }
//
//        return newList.next;


        //Time - O(n)  Space - O(1)


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
