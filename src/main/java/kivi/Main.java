package kivi;

import kivi.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.dynamicBuild();
        System.out.println("Original list:");
        printLinkedList(list.head);

        list.insertList(2, 4);
        System.out.println("After inserting 4 at position 2:");
        printLinkedList(list.head);

        list.deleteList(4);
        System.out.println("After deleting 4:");
        printLinkedList(list.head);

        int pos = list.getPositionOfElement(3);
        if (pos != -1) {
            System.out.println("Position of 3: " + pos);
        } else {
            System.out.println("Element 3 not found.");
        }
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }
}