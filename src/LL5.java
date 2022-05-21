public class LL5 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode newList = new ListNode(0);
        ListNode temp = newList;

        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }
            else if(list1.val>list2.val){
                temp.next=list2;
                temp=temp.next;
                list2 = list2.next;
            }
        }

        if(list1!=null){
            temp.next = list1;
        }

        if(list2!=null){
            temp.next=list2;
        }

        return newList.next;


    }

}
