package datastructure.linear.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Oracle
        List<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.remove(2);
        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.remove(2);

        System.out.println(integerLinkedList);
        System.out.println(integerArrayList);

        Node head = new Node(1);
        Node node2 = new Node(2);
        Node tailNode = new Node(3);

        head.next = node2;
        node2.next = tailNode;

        Node temporaryNode = head;
        System.out.println(temporaryNode.data);
        while (temporaryNode.next != null) {
            temporaryNode = temporaryNode.next;
            System.out.println(temporaryNode.data);
        }
    }
}
