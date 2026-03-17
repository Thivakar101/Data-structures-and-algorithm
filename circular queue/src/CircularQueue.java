public class CircularQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }


    public void enqueue(int val) {
        if (isFull()) throw new RuntimeException("Queue is full");
        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
    }


    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        int val = arr[front];
        front = (front + 1) % capacity;  // wrap around
        size--;
        return val;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return arr[front];
    }

    public void display() {
        if (front==-1 && rear==0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
