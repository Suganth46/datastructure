package stack;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack stack=new DynamicStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
    }
}
