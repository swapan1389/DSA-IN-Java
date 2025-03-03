
public class Diameter_Binary_Tree_Approach1 {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static  class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }
    }
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left_height = height(root.left);
        int right_height = height(root.right);
        return Math.max(left_height, right_height) + 1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int currentDia = Math.max(leftDia, rightDia);
        return Math.max(currentDia, 1 + height(root.left) + height(root.right));
    }
        public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       // BinaryTree tree=new BinaryTree();
        Node root=Diameter_Binary_Tree_Approach1.BinaryTree.BuildTree(nodes);
        //System.out.println(root.data);
        int result=diameter(root);
        System.out.println("Diameter of the tree is: "+result);

    }
}