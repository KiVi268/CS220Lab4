package kivi.util;

import kivi.Node;

public class DoubleLinkedList {
    private Node head;
    private Node tail;

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

    public boolean checkIsPalindrome() {
        Node head = null;
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        while (current != null) {
            if (current.getData() != current.prev.getData()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "DoubleLinkedList{}";
    }
}
