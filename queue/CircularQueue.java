package queue;



public class CircularQueue {
    private int[] arr;
    private int size,front,rear,capacity;

    public CircularQueue(int capacity){
        arr=new int[capacity];
        this.capacity=capacity;
        size=0;
        front=-1;
        rear=-1;
    }
    public void enQueue(int value) throws QueueExecption {
        if(isFull()) {
            throw new QueueExecption("Queue is Full");
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%capacity;
        arr[rear]=value;
        size++;
    }
    public int deQueue() throws QueueExecption{
        if(isEmpty()){
            throw new QueueExecption("Queue is Empty");
        }
        else{
            int value=arr[front];
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%capacity;
            }
            size--;
            return value;
        }
    }
    public int peek() throws QueueExecption {
        if(isEmpty()){
            throw new QueueExecption("Queue is Empty");
        }
        return arr[front];
    }
    public void display() throws QueueExecption {
        if(isEmpty()){
            throw new QueueExecption("Queue is Empty");
        }
        else {
            int k=front;
            for(int i=0;i<size;i++){
                System.out.print(arr[k]+"->");
//                System.out.println(arr[k]+" index: "+k);
                k=(k+1)%capacity;
            }
        }
    }
    public int getSize(){
        return size;
    }
    private boolean isEmpty() {
        return size==0;
    }

    private boolean isFull() {
        return size==capacity;
    }
}
