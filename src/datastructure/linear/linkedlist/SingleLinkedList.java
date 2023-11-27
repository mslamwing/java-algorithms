package datastructure.linear.linkedlist;

public class SingleLinkedList {

    //instance variable head of type Node that created earlier, currently null
    protected Node head;
    protected Node tail;

    //default constructor doesn't have body
    public SingleLinkedList() {}

    //JavaDoc type /** then enter
    /**
     * this function inserts new Node with newData as data towards the end of the linked list
     * @param newData
     */
    public void insertLast( int newData ){

        // check if head is null or not; if null linked list is empty nothing there
        // if not null, which means head got instantiated (eg. new Node(5)) earlier and linked list has at least one element
        // then goto line 26
        if (this.head == null) {
            this.head = new Node(newData);
            return;
        }

        //create a temp variable of type head that refers to actual this.head
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

    public int getSize() {
        int count = 0;

        if (this.head == null) {
            return count;
        }

        for (Node start = this.head; start != null; start = start.next) {
            count++;
        }

        return count;
    }
}


