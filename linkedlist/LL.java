package linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        size = 0;
    }

    public void insertFirst(int vlaue) {
        Node node = new Node(vlaue);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int vlaue) {
        if (tail == null) {
            insertFirst(vlaue);
            return;
        } else {
            Node node = new Node(vlaue);
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insert(int vlaue, int index) {
        if (index == 0) {
            insertFirst(vlaue);
            return;
        }
        if (index == size) {
            insertLast(vlaue);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(vlaue, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst() {
        int val = head.vlaue;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return val;
    }

    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();

        }
        Node secLast = getindex(size - 2);
        int val = tail.vlaue;
        tail = secLast;
        tail.next = null;
        size--;
        // val=tail.vlaue;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();

        }
        if (index == size - 1) {
            return deleteLast();

        }
        Node ele = getindex(index - 1);
        int val = ele.next.vlaue;
        ele.next = ele.next.next;
        size--;
        return val;

    }

    public Node getindex(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int vlaue) {
        Node node = head;
        while (node != null) {
            if (node.vlaue == vlaue) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.vlaue + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int vlaue;
        private Node next;

        public Node(int vlaue) {
            this.vlaue = vlaue;
        }

        public Node(int vlaue, Node next) {
            this.vlaue = vlaue;
            this.next = next;
        }
    }
}
