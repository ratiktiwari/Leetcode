
//Type 1 implementation of Linked List
public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            this.next=null;
        }

    }

    public static int lengthOfLinkedList(LinkedList list){

        int count=0;

        Node temp=list.head;


        while(temp!=null){
            count++;
            temp=temp.next;
        }

//        System.out.println(count+" length");
        return count;
    }


    public static void insert(LinkedList list, int data){

        Node new_node = new Node(data);

        if(list.head==null){
            list.head = new_node;
        }
        else{
            Node temp = list.head;

            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next = new_node;
        }
    }


    public static LinkedList removeFromFront(LinkedList list){

        Node temp = list.head.next;

        list.head.next = null;

        list.head = temp;

        return list;

    }


    public static LinkedList removeFromLast(LinkedList list){

//        int length = lengthOfLinkedList(list);
//
//        if(length==0){
//            System.out.println("list is empty");
//        }
//        else {
//
//            Node temp;
//            temp = list.head;
//
//            for(int i=1; i<length-1; i++){
//                temp=temp.next;
//            }
//
//            temp.next=null;
//        }

        Node temp = list.head;

        if(temp==null){
            System.out.println("list is empty");
            return list;
        }
        if(temp.next == null){
            temp=null;
            return list;
        }
        if(temp.next.next==null){
            temp.next = null;
            return list;
        }

        while(temp.next.next!=null){
            temp=temp.next;
        }

        temp.next = null;

        return list;
    }


    //NOTE: Java is strictly pass by value
    // when passing primitive variables, copy of original variable is made on the stack
    // when passing object, copy of original object variable is made on the stack (NOTE: copy of object variable not object). If the original object variable is pointing an object in heap which has address=123245, then the copy of object variable will also have same address and will point to same object in the heap
    // the above passing is not pass by reference but is pass by value, because reference is not passed to the function, but the new object variable is copied which stores the address, since every new creation which copies something is called pass by value, hence it is pass by value.
    public static void printLinkedList(LinkedList list){

        while(list.head.next!=null){
            System.out.println(list.head.data);
            list.head=list.head.next;
        }
        System.out.println(list.head.data);

    }

    public static LinkedList insertAtLast(LinkedList list, int data){

        Node temp = list.head;
        Node newNode = new Node(data);

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next=newNode;

        return list;
    }

    public static LinkedList insertAtFront(LinkedList list, int data){

        Node newNode = new Node(data);
        newNode.next = list.head;

        list.head = newNode;

        return list;
    }

    public static LinkedList insertAtSpecificPosition(LinkedList list, int data, int position){
        //position>=1 and position<=n+1

        if(position==1){
            list = insertAtFront(list, data);
            return list;
        }
        else {
            Node temp = list.head;

            Node newNode = new Node(data);


            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

            return list;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

//        list = insert(list, 1);
//        list = insert(list, 2);
//        list = insert(list, 3);
//        list = insert(list, 4);
//        list = insert(list, 5);
//        list = insert(list, 6);
//        list = insert(list, 7);

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        insert(list, 7);

        System.out.println(list.head.data+" head data");

        printLinkedList(list);

        System.out.println(list.head.data+" head data");

//        list = removeFromLast(list);
//
//        System.out.println();
//
//        printLinkedList(list);
//
//        list = removeFromLast(list);
//
//        System.out.println();
//
//        printLinkedList(list);


//        removeFromLast(list);
//
//        printLinkedList(list);
//
//        removeFromFront(list);
//
//        printLinkedList(list);

//        insertAtLast(list,8);

//        insertAtFront(list, 0);

//        list = insertAtSpecificPosition(list, 100, 1);
//        System.out.println();
//        printLinkedList(list);
    }
}
