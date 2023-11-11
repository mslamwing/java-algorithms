package datastructure.linear.linkedlist;

public class StackMain {

    public static void main(String[] args) {
        Stack myStack = new Stack();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(5);
//        myStack.push(50);

        try {
            // this causes exception
            myStack.pop();
        } catch (RuntimeException e) {
            System.out.println("Exception happened while pop: " + e);
        }

        myStack.push(99);

        myStack.printLinkedList();

        System.out.println(myStack.isEmpty());
    }
}
