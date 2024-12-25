public class Delete_Node_In_BST {
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



    static Node deleteNode(Node root,int val){
        if(val<root.data){
            root.left = deleteNode(root.left, val);
        }
        else if(val>root.data){
            root.right = deleteNode(root.right, val);
        }

        else{// root.data==val

            //case 1----No child
            if(root.left==null && root.right==null){
                return null;
            }

            // case 2---one chil
            if(root.left==null){
                return root.right;
            }

            if(root.right==null){
                return root.left;
            }


            // case 2----2 child present
            Node inordersuccessor=findInorderSuccessor(root.right);
            root.data=inordersuccessor.data;
            root.right = deleteNode(root.right, inordersuccessor.data);

        }
        return root;
    }

    static  Node findInorderSuccessor(Node root){
        Node current = root;
        while(current.left!=null){
            current = current.left;
        }
        return current;
    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insertNode(root, values[i]);
        }
        inorder(root);
        System.out.println();
        root = deleteNode(root, 3);
        inorder(root);
    }

    
}
