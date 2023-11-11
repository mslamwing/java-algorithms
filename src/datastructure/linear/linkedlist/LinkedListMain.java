package datastructure.linear.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {

        SingleLinkedList s1 = new SingleLinkedList();

        s1.insertLast(2 );
        s1.insertLast(100);
        s1.insertLast(5);
        s1.insertLast(94);
        s1.insertLast(200);

//        s1.deleteLast();

        s1.printLinkedList();
    }
}
