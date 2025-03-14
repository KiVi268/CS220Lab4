package kivi;

public class DoubleNode {
     private int data;
     DoubleNode next, previous;

    public DoubleNode(int data) {
        this.data = data;
        this.next = this.previous = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "data=" + data +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }
}
