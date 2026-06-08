//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Node{
    int data;
    Node next;
    Node(int data){
        this.data= this.data;
        next=null;
    }
}
class CLL{
    Node tail;
    static int c;
    CLL(){
        tail=null;
        c=0;
    }
    void insertfront(int data){
        Node newnode =new Node(data);
        if(tail==null){
            tail=newnode;
            c++;
            return;
        }
        newnode.next=tail.next;
        tail.next=newnode;
        c++;
        return;
    }
    void insertback(int data){
        Node newnode =new Node(data);
        if(tail==null){
            tail=newnode;
            c++;
            return;
        }
        newnode.next=tail.next;
        tail=newnode;
        c++;
        return;
    }
    void insertposition(int data,int position){
        if(tail==null || position>c){
            System.out.println("INVALIDDDDD");
            return;
        }
        Node temp=tail;
        for(int i=0;i<position;i++){
            temp=temp.next;
        }
        Node newnode=new Node(data);
        newnode.next=temp.next;
        temp.next=newnode;
        c++;
        return;

    }
    void display(){
        Node temp=tail;
        do {
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
        while(temp!=tail.next);
        return;


}
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }
    }
}