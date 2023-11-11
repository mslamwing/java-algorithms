package datastructure.linear.linkedlist;

public class Stack extends SingleLinkedList {

    public int peek() {

        if (this.head != null) {
            return this.head.data;
        }

        //Google interview question about exception
        throw new RuntimeException("List is empty!");
    }

    //deleteFirst O(1)
    public int pop() {

        if (this.head == null) {
            throw new RuntimeException("List is empty!");
        }

        this.head = this.head.next;
        return peek();
    }

    public void push(int newData) {

        Node newNode = new Node(newData);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        newNode.next = this.head;
        this.head = newNode;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}
