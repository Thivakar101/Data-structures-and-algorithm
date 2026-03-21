public class BinaryTree {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    class Queue {
        Node front, rear;


        void enqueue(Node data) {
            if (data == null) return;

            if (rear == null) {
                front = rear = data;
                return;
            }

            rear.right = data;
            rear = data;
        }

        // Dequeue
        Node dequeue() {
            if (front == null) return null;

            Node temp = front;
            front = front.right;

            if (front == null) {
                rear = null;
            }

            temp.right = null;
            return temp;
        }

        boolean isEmpty() {
            return front == null;
        }
    }




    Node root;

    void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue q = new Queue();
        q.enqueue(root);

        while (!q.isEmpty()) {
            Node temp = q.dequeue();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                q.enqueue(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                q.enqueue(temp.right);
            }
        }

    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        System.out.println("Root: " + tree.root.data);
        System.out.println("Left Child of Root: " + tree.root.left.data);
        System.out.println("Right Child of Root: " + tree.root.right.data);
    }

}

//