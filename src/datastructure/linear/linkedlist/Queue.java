package datastructure.linear.linkedlist;

public class Queue extends SingleLinkedList {

    public void enqueue(int x) {
        this.insertLast(x);
    }

    /**
     * remove from front of the linked list
     * @return
     */
    public int dequeue() {

        // if linked list is empty then throw exception, nothing to delete please enqueue first
        if (this.head == null) {
            throw new RuntimeException("nothing to delete please enqueue first");
        }

        // ---------------- something there
        //  if only 1 element present then make head null
        if (this.head.next == null) {
            int itemDeleted = this.head.data;
            this.head = null;
            return itemDeleted;
        }

        // if you reach here there are more than 1 element
        int itemDeleted = this.head.data;
        this.head = this.head.next;
        return itemDeleted;
    }

    public int peek() {
        if (this.head != null) {
            return this.head.data;
        }

        throw new RuntimeException("nothing in the linked list");
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void clear() {
        if (this.head != null) {
            this.head = null;
        }
    }
}
