package DSA_Stack_Queue.thucHanh;

public class MyStack {
    private int arr[];
    private int size;
    private int index=0;

    public MyStack(int size) {
        this.size = size;
        arr=new int[size];
    }
    public int size(){
        return index;
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
       arr[index]=element;
       index++;
    }
    public int pop(){
        if (isEmpty()){
            throw new NullPointerException("Stack is Null");
        }
        return arr[--index];
    }
    public boolean isEmpty(){
        if (index==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (index==size){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
