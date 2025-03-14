package kivi.util;

import kivi.Node;

public class DoubleLinkedList {
    public void printInReverse() {
        Node head = null;
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        while (current != null) {
            System.out.print(current.getData() + " <--- ");
            current = current.prev;
        }
        System.out.println("NULL");
    }



}
