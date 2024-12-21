public class Sum_Of_Nodes {
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

    public static int sumNode(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sumNode(root.left)+sumNode(root.right);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       // BinaryTree tree=new BinaryTree();
        Node root=Sum_Of_Nodes.BinaryTree.BuildTree(nodes);
        //System.out.println(root.data);
        int result=sumNode(root);
        System.out.println(result);
    }
    
}
