public class Print_Values_in_Range_in_BST {
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

    static void PrintInRange(Node root,int min,int max){
        if(root == null) return;
        if(root.data >= min && root.data <= max){
            System.out.print(root.data + " ");
            PrintInRange(root.left, min, max);
            PrintInRange(root.right, min, max);
        }
        else if(root.data>=max){
            PrintInRange(root.left, min, max);
        }
        else if(root.data<=min){
            PrintInRange(root.right, min, max);
        }
    }

    public static void main(String[] args) {
        int values[]={8,5,6,3,1,4,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insertNode(root, values[i]);
        }
        PrintInRange(root, 6, 10);
    }
    
}
