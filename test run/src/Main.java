class Node{
    int data;
    Node next;
     Node(int val){
         this.data=val;
         this.next=null;
     }

}
class Sll{
    private Node first,last;
    public  Sll(){
        first=null;
        last=null;
    }
    public void add(int val){
        Node newnode=new Node(val);
        if(first==null){
            first=newnode;
            last=newnode;

        }
        else{
            last.next=newnode;
            last=newnode;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Sll fsli=new Sll();
        fsli.add(10);

    }
}