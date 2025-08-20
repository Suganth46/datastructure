package queue;


public class LinkedListQueue {
    private Node head;
    private Node tail;
    private int size;
    public LinkedListQueue(){
        size=0;
    }
    public void enQueue(int value){
        Node node=new Node(value);
        if(tail==null){
            head=tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    public int deQueue() throws Exception{
       if(isEmpty()){
           throw new QueueExecption("Queue is Empty");
       }
       else {
            int value = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return value;
        }
    }
    public int peek() throws Exception{
        if(isEmpty()){
                throw  new QueueExecption("Queue is Empty");
        }
        else{
            return head.value;
        }
    }
    public void display() throws QueueExecption {
        if(isEmpty()){
            throw new QueueExecption("Queue is Empty");
        }
        else{
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.print("END\n");
        }
    }
    public boolean isEmpty() {
        return size==0;
    }
    public int getSize(){
        return size;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
