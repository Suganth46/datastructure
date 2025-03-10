package queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    int ptr = -1;

    public boolean insert(int value) {
        if (isFull()) {
            System.out.println("queue is full");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        int remove = data[0];
        for (int i = 1; i < ptr; i++) {
            data[i - 1] = data[i];
        }
        ptr--;
        return remove;
    }
    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        return data[0];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
