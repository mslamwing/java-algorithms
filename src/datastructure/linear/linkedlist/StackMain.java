package datastructure.linear.linkedlist;

public class StackMain {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(5);
        myStack.push(50);

        myStack.pop();

        myStack.push(99);

        myStack.printLinkedList();

        System.out.println(myStack.isEmpty());

    }
}
