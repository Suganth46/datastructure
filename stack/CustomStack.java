package stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }
    int ptr=-1;
    public boolean push(int value) {
        if(isFull()){
            System.out.print("stack is full"); 
            return false;
        }
        ptr++;
        data[ptr]=value;
        return true;
    }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new StackExecption("stack is empty");
        }
        return data[ptr--];
    }
    public int peek()throws Exception{
        if(isEmpty()){
            throw new StackExecption("stack is empty");
        }
        return data[ptr];
    }
    public void display(){
        for (int i = 0; i < ptr; i++) {
            System.out.print(data[ptr]+" ");
        }
    }
    public boolean isEmpty(){
             return ptr==-1;
    }
    
    public boolean isFull(){
        return ptr==data.length-1;
    }
}
