public class Count_Of_Nodes {
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

    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int countleft=countNode(root.left);
        int countright=countNode(root.right);
        return 1+countright+countleft;


    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       // BinaryTree tree=new BinaryTree();
        Node root=Count_Of_Nodes.BinaryTree.BuildTree(nodes);
        //System.out.println(root.data);
        int result=countNode(root);
        System.out.println(result);
    }
    
    
}
