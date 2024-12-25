public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static Node insertNode(Node root,int val){
        if(root == null){
            return new Node(val);
        }
        if(val<root.data){
            root.left = insertNode(root.left, val);
        }
        else{
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insertNode(root, values[i]);
        }
        inorder(root);
    }
}