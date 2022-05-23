
class ListNode{

    ListNode prev;
    String data;
    ListNode next;

    ListNode(){

    }

    ListNode(String d){
        this.prev=null;
        this.data=d;
        this.next=null;
    }

}


public class LL11 {

    ListNode head, tail, cursor;




    public void insert(ListNode cursor, ListNode newNode){
        cursor.next = newNode;
        newNode.prev = cursor;
        cursor = cursor.next;
    }



//    public BrowserHistory(String homepage) {
//        head = new ListNode(homepage);
//        cursor = head;
//    }

    public void visit(String url) {
        ListNode newNode = new ListNode(url);
//        insert(cursor, newNode);
        cursor.next = newNode;
        newNode.prev = cursor;
        cursor = cursor.next;
    }

    public String back(int steps) {

        while(steps!=0 && cursor.prev!=null){
            cursor=cursor.prev;
            steps--;
        }

        return cursor.data;

    }

    public String forward(int steps) {

        while(steps!=0 && cursor.next!=null){
            cursor=cursor.next;
            steps--;
        }

        return cursor.data;

    }


}
