package linkedlist;

public class CLL {
    private Node head;
    private Node tail;
    private int size;
    public CLL(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        if(tail==null){
            head=node;
            tail=head;
        }
        tail.next=node;
        node.next=head;
        head=node;
        size+=1;
    }
    public void insertLast(int val){
        Node node=new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size+=1;

    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val, temp.next);
        temp.next=node;
        size+=1;
    }
    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        tail.next=head;
        size-=1;
        return val;
    }
    public int deleteLast(){
        int val=tail.val;
        if(size<=1){
            return deleteFirst();
        }
        Node seclast=get(size-2);
        seclast.next=head;
        tail=seclast;
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
        Node temp=get(index-1);
        int val=temp.next.val;
        temp.next=temp.next.next;
        size-=1;
        return val;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void display(){
        Node node=head;
        if(head!=null){
            do{
                System.out.print(node.val+"->");
                node=node.next;
            }while(node!=head);
        }
        System.out.print("HEAD\n");
    }
    private class Node {
        private Node next;
        private int val;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
