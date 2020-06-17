package DSA_Stack_Queue.baiTap;

import java.util.Arrays;

public class Queue {
    public class Node {
        private Node link;
        private int data;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    private Node front = null;
    private Node rear = null;

    public void enQueue(int element) {
        Node temp = new Node(element);
        if (this.front == null) {
            this.front = temp;
        } else {
            this.rear.link = temp;
        }
        this.rear = temp;
        this.rear.link = this.front;
    }

    public void deQueue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }
        if (this.front == this.rear) {
            this.front = null;
        } else {
            this.front = this.front.link;
        }
        this.rear.link = this.front;
    }
    public void displayQueue() {
        Node temp = this.front;
        System.out.print("Elements in Circular Queue are: ");
        while (temp.link != this.front) {
            System.out.print(temp.data+" ");
            temp = temp.link;
        }
        System.out.print(temp.data+" ");
        System.out.println();
    }

}

