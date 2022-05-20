public class LL1 {

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


    public int getDecimalValue(ListNode head) {

        ListNode temp = head;
//        String s = "";
//        int res = 0;
//        int pow = 0;
//
//        while(temp!=null){
//            s = s + temp.val;
//            temp=temp.next;
//        }
//
//        for(int i=s.length()-1; i>=0; i--){
//            res = (int) (res + (s.charAt(i) - '0') * Math.pow(2, pow++));
//        }

        int res = 0;

        while(temp!=null){
            res *= 2;
            res+=temp.val;
            temp=temp.next;
        }

        return res;

    }

}
