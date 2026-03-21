class Node{
    int data;
    Node next;
    Node previous;
     Node(int val){
         this.data=val;
         this.next=null;
         this.previous=null;
     }

}
class cll {
    private Node first,last;
    public cll(){
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
    public void print(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void removefront(){
        if(first==null) return;
        first=first.next;
        return;
    }
    public void removelast(){
        if(first== last){
            first=null;
            last=null;
            return;
        }
        Node temp=first;
        while(temp!=last){
            temp=temp.next;
        }
        temp.next=null;
        temp=last;
        return;

    }
    public void remove(int position){
        if(position==0){
            removefront();
            return;
        }
        Node temp=first;
        for(int i=0;i<position-1;i++){
            temp=temp.next;

        }
        if(temp.next==last){
            temp=last;
        }
        temp.next=temp.next.next;
    }

}
public class Main {
    public static void main(String[] args) {
        cll fcli =new cll();
       fcli.add(10);

    }
}