package datastructure.linear.linkedlist;

public class SingleLinkedList {

    public Node head;

    public SingleLinkedList(int headData) {
        this.head = new Node(headData);
    }

    public void insert( int newData ){
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
        System.out.print("Head: " + this.head.data);
        Node temp = this.head.next;
        while (temp.next != null) {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
        System.out.println(" -> " + temp.data + " -> null");
    }
}


