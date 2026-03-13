
import java.util.Scanner;

public class Queue {
    static int n = 5;
    static int[] queue = new int[n];
    static int top = 0;

    public static void enqueue(int a) {
        if (top == n) {
            System.out.println("Queue Overflow");
        } else {
            queue[top] = a;
            top++;
        }
    }

    public static void dequeue() {
        if (top == 0) {
            System.out.println("Queue Underflow");
        } else {
            for (int i = 0; i < top - 1; i++) {
                queue[i] = queue[i + 1];
            }
            top--;
        }
    }

    public static void print() {
        for (int i = 0; i < top; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("1 Enqueue  \n2 Dequeue  \n3 Print \n4 Exit");
                System.out.println("Enter option:");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        int a = sc.nextInt();
                        enqueue(a);
                        break;

                    case 2:
                        dequeue();
                        break;

                    case 3:
                        print();
                        break;

                    case 4:
                        return;
                }
            }
        }
    }
