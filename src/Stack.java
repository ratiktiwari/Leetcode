public class Stack {

    static final int max = 1000;

    int top;
    int a[] = new int[max];

    Stack(){
        top=-1;
    }

    public void push(int data){

        if(top>=max-1){
            System.out.println("Overflow");
            return;
        }
        else{
            a[++top]=data;
            System.out.println(data+" pushed");
            return;
        }

    }

    public int pop(){
        if(top<0){
            System.out.println("Underflow");
            return -1;
        }

        int popped = a[top--];
        return popped;
    }

    public int peek(){
        if(top<0){
            System.out.println("Underflow");
        }

        return a[top];
    }

    public void printStack(){
        for(int i=top; i>=0; i--){
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + " popped");
        System.out.println(s.peek() + " peeked");

        System.out.println("Stack is :");

        s.printStack();
    }

}
