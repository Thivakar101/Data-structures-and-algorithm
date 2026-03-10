public class SinglyLinkedList {
    private Node first, last;

    public SinglyLinkedList() {
        first = null;
        last = null;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public void reverseprint() {
        Node temp = last;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public void ArrayToList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    public void StringToList(String str, char delimiter) {
        String[] arr = str.split(String.valueOf(delimiter));
        for (int i = 0; i < arr.length; i++) {
            add(Integer.parseInt(arr[i]));
        }
    }
}