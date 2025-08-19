package queue;

public class Main {
    public static void main(String[] args) throws Exception{
        CustomQueue queue=new DynamicQueue();
        queue.insert(1);
        queue.insert(2);
        System.out.println(queue.remove());
        LinkedListQueue llq=new LinkedListQueue();
        llq.enQueue(10);
        llq.enQueue(20);
        llq.enQueue(30);
        llq.deQueue();
        System.out.println(llq.peek());
         CircularQueue cq=new CircularQueue(5);
         cq.enQueue(10);
         cq.enQueue(20);
         cq.enQueue(30);
         cq.enQueue(40);
         cq.deQueue();
         cq.enQueue(50);
         cq.enQueue(60);
         cq.display();
            LinkedListCircularQueue lcq=new LinkedListCircularQueue();
            lcq.enQueue(10);
            lcq.enQueue(20);
            lcq.enQueue(30);
            lcq.enQueue(40);
            lcq.deQueue();
            lcq.enQueue(50);
            lcq.display();
    }
}
