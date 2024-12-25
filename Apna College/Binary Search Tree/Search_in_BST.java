public class Search_in_BST {
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
    static  boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data==key){
            return true;
        }

        if(key<root.data){
            return  search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insertNode(root, values[i]);
        }
        int key=5;
        if(search(root,key)){
            System.out.println(key+" is present in the BST");
        }
        else{
            System.out.println(key+" is not present in the BST");
        }
    }
    
}
