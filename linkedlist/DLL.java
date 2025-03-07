package linkedlist;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        if (tail == null) {
            head = node;
            tail = head;
        }
        head = node;
        size += 1;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next, temp);
        temp.next.prev = node;
        temp.next = node;
        size += 1;
    }
    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        head.prev=null;
        if(head==null){
            tail=null;
        }
        size-=1;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        int val=tail.val;
        tail=tail.prev;
        tail.next=null;
        size-=1;
        return val;

    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        int val=temp.next.val;
        temp.next=temp.next.next;
        temp.next.prev=temp;
        size-=1;
        return val;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("End\n");
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
