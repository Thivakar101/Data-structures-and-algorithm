public class Main {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();          // Queue: 10 20 30
        q.dequeue();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);        // wraps around — fills slot 0
        q.display();          // Queue: 20 30 40 50 60
    }
}
