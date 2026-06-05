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
    public boolean search(int data){
        return recsearch(root,data);
    }
    private boolean recsearch(Node root,int data){
        if(root==null){
            return false;
        }  if (root.data==data) {
            return true;
        } if (data>root.data) {
            return recsearch(root.right,data);
        }
        return recsearch(root.left,data);

    }
    public void inorder(){
        recinorder(root);
    }
    private void recinorder(Node root){
        if(root!=null){
            recinorder(root.left);
            System.out.println(root.data+" ");
            recinorder(root.right);
        }

    }
    public void preorder(){
        recpreorder(root);
    }
    private void recpreorder(Node root){
        if(root!=null){

            System.out.println(root.data+" ");
            recpreorder(root.left);
            recpreorder(root.right);
        }

    }
}