package datastructure.linear.linkedlist;

public class SingleLinkedList {

    protected Node head;

    public SingleLinkedList() {}

    public void insertLast( int newData ){

        if (this.head == null) {
            this.head = new Node(newData);
        }

        Node temp = this.head;
        while ( temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node( newData );
    }

    public void deleteLast() {
        Node temp = this.head.next;
        Node previous = this.head;

        while (temp.next != null) {
            temp = temp.next;
            previous = previous.next;
        }
        previous.next = null;
        System.out.println("Deleted: " + temp.data);
    }

    public void printLinkedList() {

        if (this.head.next == null) {
            System.out.print("Head: " + this.head.data);
            return;
        }

        System.out.print("Head: " + this.head.data);
        Node temp = this.head.next;
        while (temp.next != null) {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
        System.out.println(" -> " + temp.data + " -> null");
    }
}


