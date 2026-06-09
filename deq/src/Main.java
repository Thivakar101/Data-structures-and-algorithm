//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Node {
    int data;
    Node prev,next;
    Node(int data){
        this.data=data;
        prev=null;
        next=null;
    }
}
class deq{
    Node first,last=null;
    public void insertfirst(int data){
        Node newnode= new Node(data);
        if(first==null && last==null){
            first =last=newnode;
            return;
        }
        first.prev=newnode;
        newnode.next=first;
        first=newnode;
        return;

    }
     void insertlast(int data){
        Node newnode= new Node(data);
        if(first==null && last==null){
            first =last=newnode;
            return;
        }
        last.next=newnode;
        newnode.prev=last;
        last=newnode;

    }
    void deletefirst(){
        if(first==null && last==null){
            System.out.println("NO QUEUEEE");
            return;
        }
        first.next.prev=null;
        first=first.next;
        return;
    }
    void deletelast(){
        if(first==null){
            System.out.println("NO QUEUEEE");
            return;
        }

        last=last.prev;
        last.next=null;
        return;
    }
    void peekfront(){
        if(first==null ){
            System.out.println("NO QUEUEEE");
            return;
        }
        System.out.println(first.data);
    }
    void peekrear(){
        if(first==null ){
            System.out.println("NO QUEUEEE");
            return;
        }
        System.out.println(last.data);
    }

}
public class Main {
    public static void main(String[] args) {
        deq d=new deq();
        d.insertfirst(10);
        d.insertfirst(20);
        d.insertlast(30);
        d.insertlast(40);
        d.peekfront();
        d.deletefirst();
        d.peekfront();
        d.deletelast();
        d.peekrear();


    }
}