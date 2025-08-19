package stack;

public class LinkedListStack {
    private Node head;
    private Node tail;
    private int size;
    public LinkedListStack(){
        size=0;
    }
    public void push(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new StackExecption("stack is Empty");
        }else{
            int value= head.value;
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return value;
        }
    }
    public  int peek() throws Exception{
        if(isEmpty()){
            throw new StackExecption("Stack is Empty");
        }
        else{
            return head.value;
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
