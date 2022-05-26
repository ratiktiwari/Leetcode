
//Type 2 implementation of Linked List

class Node{
    int data;
    Node next;
    
    Node(){
        this.next=null;
    }

    Node(int d){
        this.data=d;
        this.next=null;
    }

}

public class LinkedList2 {


    public static int lengthOfNode(Node head){

        int count=0;

        Node temp=head;


        while(temp!=null){
            count++;
            temp=temp.next;
        }

//        System.out.println(count+" length");
        return count;
    }


    public static void insert(Node head, int data){

        Node new_node = new Node(data);

        if(head==null){
            head = new_node;
        }
        else{
            Node temp = head;

            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next = new_node;
        }

//        return head;
    }


    public static Node removeFromFront(Node head){

        Node temp = head.next;

        head.next = null;

        head = temp;

        return head;

    }


    public static Node removeFromLast(Node head){

//        int length = lengthOfNode(head);
//
//        if(length==0){
//            System.out.println("list is empty");
//        }
//        else {
//
//            Node temp;
//            temp = head;
//
//            for(int i=1; i<length-1; i++){
//                temp=temp.next;
//            }
//
//            temp.next=null;
//        }

        Node temp = head;

        if(temp==null){
            System.out.println("list is empty");
            return head;
        }
        if(temp.next == null){
            temp=null;
            return head;
        }
        if(temp.next.next==null){
            temp.next = null;
            return head;
        }

        while(temp.next.next!=null){
            temp=temp.next;
        }

        temp.next = null;

        return head;
    }


    //NOTE: Java is strictly pass by value
    // when passing primitive variables, copy of original variable is made on the stack
    // when passing object, copy of original object variable is made on the stack (NOTE: copy of object variable not object). If the original object variable is pointing an object in heap which has address=123245, then the copy of object variable will also have same address and will point to same object in the heap
    // the above passing is not pass by reference but is pass by value, because reference is not passed to the function, but the new object variable is copied which stores the address, since every new creation which copies something is called pass by value, hence it is pass by value.
    public static void printNode(Node head){

//        Node temp = head;
//
//        while(temp.next!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//        System.out.println(temp.data);



        while(head.next!=null){
            System.out.println(head.data);
            head=head.next;
        }
        System.out.println(head.data);

    }

    public static Node insertAtLast(Node head, int data){

        Node temp = head;
        Node newNode = new Node(data);

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next=newNode;

        return head;
    }

    public static Node insertAtFront(Node head, int data){

        Node newNode = new Node(data);
        newNode.next = head;

        head = newNode;

        return head;
    }

    public static Node insertAtSpecificPosition(Node head, int data, int position){
        //position>=1 and position<=n+1

        if(position==1){
            head = insertAtFront(head, data);
            return head;
        }
        else {
            Node temp = head;

            Node newNode = new Node(data);


            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            return head;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);

        insert(head, 2);
        insert(head, 3);
        insert(head, 4);
        insert(head, 5);
        insert(head, 6);
        insert(head, 7);

        System.out.println(head.data+" head data");

        printNode(head);

        System.out.println(head.data+" head data");

//        list = removeFromLast(list);
//
//        System.out.println();
//
//        printNode(list);
//
//        list = removeFromLast(list);
//
//        System.out.println();
//
//        printNode(list);


//        removeFromLast(list);
//
//        printNode(list);
//
//        removeFromFront(list);
//
//        printNode(list);

//        insertAtLast(list,8);

//        insertAtFront(list, 0);

//        list = insertAtSpecificPosition(list, 100, 1);
//        System.out.println();
//        printNode(list);
    }
}
