package datastructure.linear.linkedlist;

public class QueueExample {

    public static void main(String[] args) {
        Queue queue1 = new Queue();

        queue1.enqueue(12);
        queue1.enqueue(100);
        queue1.enqueue(90);
        queue1.enqueue(1);

        queue1.dequeue();

        System.out.println(queue1.getSize());

        queue1.printLinkedList();
    }
}
