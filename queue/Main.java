package queue;

public class Main {
    public static void main(String[] args) throws Exception{
        CustomQueue queue=new DynamicQueue();
        queue.insert(1);
        queue.insert(2);
        System.out.println(queue.remove());
    }
}
