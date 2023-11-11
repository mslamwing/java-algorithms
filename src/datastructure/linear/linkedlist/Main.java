package datastructure.linear.linkedlist;

import java.awt.*;
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

//        System.out.println(integerLinkedList);
//        System.out.println(integerArrayList);

        SingleLinkedList s1 = new SingleLinkedList(1);

        s1.insert(2 );
        s1.insert(100);
        s1.insert(5);
        s1.insert(94);
        s1.insert(200);

//        s1.deleteLast();

        s1.printLinkedList();
    }
}
