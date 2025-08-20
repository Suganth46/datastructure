package queue;

public class LinkedListCircularQueue {
    private Node front;
    private Node rear;
    private int size;
    public LinkedListCircularQueue(){
        front=rear=null;
        size=0;
    }
    public void enQueue(int value){
        Node node=new Node(value);
        if(isEmpty()){
            front=rear=node;
            rear.next=front;
        }else{
            rear.next=node;
            rear=node;
            rear.next=front;
        }
        size++;
    }
    public int deQueue() throws QueueExecption {
        if(isEmpty()){
            throw new QueueExecption("Queue is empty");
        }
        int value=front.value;
        if(front==rear){
            front=rear=null;
        }else {
            front = front.next;
            rear.next = front;
        }
        size--;
        return value;
    }
    public int peek() throws QueueExecption {
        if(isEmpty()){
            throw new QueueExecption("Queue is empty");
        }
        return front.value;
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new QueueExecption("Queue is empty");
        }
        else{
            Node temp=front;
            do{
                System.out.print(temp.value+"->");
                temp=temp.next;
            }while (temp!=front);
            System.out.print("END");
        }
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty() {
        return size==0;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
    }
}
