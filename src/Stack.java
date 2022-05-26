public class Stack {

    static final int max = 1000;

    int top;
    int a[] = new int[max];

    public void push(int data){

        if(top>=max){
            System.out.println("Overflow");
            return;
        }
        else{
            a[++top]=data;
            System.out.println(data+" pushed");
            return;
        }

    }

//    public int pop(){
//
//    }


    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

//        System.out.println(s.pop());
    }

}
