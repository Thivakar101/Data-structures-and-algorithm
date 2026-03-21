//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            SinglyLinkedList list = new SinglyLinkedList();
            int val = sc.nextInt();
            int[] arr = {1, 2, 3, 4, 5};
            String str = "1,2,3,4,5";
            char delimiter = ',';
            list.StringToList(str, delimiter);
            //adding the elements of the array into the existing linked list
            list.ArrayToList(arr);
            list.add(val);
            list.print();
            list.insertback(val);
            int position=3;
            list.add(val,position);




    }
}
//public ListNode reverseList(ListNode head) {
//    if (head == null || head.next == null) return head;
//    ListNode newHead = reverseList(head.next);
//    head.next.next = head;
//    head.next = null;
//    return newHead;
//}