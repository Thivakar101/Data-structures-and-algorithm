class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
class Binarysearchtree{
    Node root=null;
    public void insert(int data){
        recinsert(root,data);
    }
    private Node recinsert(Node root, int data){
        if(root==null){
            root=new Node(data);
        } else if (data>root.data) {
                 root.right=recinsert(root.right,data);

        } else if (data<root.data) {
            root.left=recinsert(root.left,data);

        }
        return root;
    }
}