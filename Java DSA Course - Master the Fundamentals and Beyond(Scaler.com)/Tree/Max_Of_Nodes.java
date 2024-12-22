public class Max_Of_Nodes{
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

    public static int findmax(Node root){
        if(root==null){
            return 0;
        }
        int leftmax=findmax(root.left);
        int rightmax=findmax(root.right);
        int currentmax=Math.max(leftmax,rightmax);
        return Math.max(currentmax,root.data);


    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=Max_Of_Nodes.BinaryTree.BuildTree(nodes);
        int result=findmax(root);
        System.out.println("Maximum value of nodes is : "+result);
    }



}