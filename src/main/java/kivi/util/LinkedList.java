package kivi.util;

import kivi.Node;

import java.util.Scanner;

public class LinkedList {
    private Node head;

    public void dynamicBuild() {
        Scanner scanner = new Scanner(System.in);
        Node tail = null;

        System.out.println("Enter numbers(-1 to stop):");
        while (true) {
            int value = scanner.nextInt();
            if (value == -1) break;

            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                tail.setNext(newNode);
                tail = newNode;
            }
        }
    }

    public void insertList(int position, int value) {
        Node newNode = new Node(value);
        if (position == 0) {
            newNode.setNext(head);
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    public void deleteList(int value) {
        if (head == null) return;

        if (head.getData() == value) {
            head = head.getNext();
            return;
        }
        Node current = head;
        while (current.getNext() != null && current.getNext().getData() != value) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
    }

    public int getPositionOfElement(int value) {
        Node current = head;
        int position = 0;

        while (current != null) {
            if (current.getData() == value) return position;
            current = current.getNext();
            position++;
        }

        return -1;
    }

    public void concatenateLists(LinkedList other) {
        if (head == null) {
            head = other.head;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(other.head);
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
