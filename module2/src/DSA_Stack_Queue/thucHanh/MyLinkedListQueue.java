package DSA_Stack_Queue.thucHanh;

public class MyLinkedListQueue {
    public class Node{
        public Node next;
        public int key;

        public Node(int key) {
            this.key = key;
        }
    }
    public Node head;
    public Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp=new Node(key);
        if (this.tail==null){
            this.head=this.tail=temp;
            return;
        }
        this.tail.next=temp;
        this.tail=temp;
    }
    public Node dequeue(){
        if (this.head==null){
            return null;
        }
        Node temp=head;
        head=head.next;
        if (this.head==null){
            this.tail=null;
        }
        return temp;
    }
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
