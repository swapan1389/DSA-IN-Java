public class Diameter_Binary_Tree_Approach2 {
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
public static class TreeInfo{
    int diameter = 0;
    int height = 0;
    TreeInfo(int diameter,int height){
        this.diameter = diameter;
        this.height=height;
    }
}

public static TreeInfo diameter2(Node root){
    if(root==null){
        return new TreeInfo(0,0);
    }

    TreeInfo left=diameter2(root.left);
    TreeInfo right=diameter2(root.right);
    int myheight=Math.max(left.height, right.height)+1;
    int diam1=left.diameter;
    int diam2=right.diameter;
    int diam3=left.height+right.height+1;
    int mydiam=Math.max(Math.max(diam1,diam1),diam3);
    TreeInfo myinfo=new TreeInfo(mydiam, myheight);
    return myinfo;
}
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       // BinaryTree tree=new BinaryTree();
        Node root=Diameter_Binary_Tree_Approach2.BinaryTree.BuildTree(nodes);
        int result=(diameter2(root)).diameter;
        System.out.println("Height of the tree is "+result);

    }

    
}
