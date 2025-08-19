package stack;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedListStack linkedListStack=new LinkedListStack();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        linkedListStack.pop();
        System.out.println(linkedListStack.peek());
    }
}
