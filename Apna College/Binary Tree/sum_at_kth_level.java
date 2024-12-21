import java.util.LinkedList;
import java.util.Queue;

public class sum_at_kth_level {
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
    public static int sum_of_Nodes(Node root,int k){
        if(root==null) return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int level=1;
        int sum=0;
        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    level++;
                }
            }
            else{
                if(level==k){
                    sum+=temp.data;
                }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        }
        return sum;

    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=sum_at_kth_level.BinaryTree.BuildTree(nodes);
        int k=2;
        int result=sum_of_Nodes(root,3);
        System.out.println("The sum of nodes at "+k+"th level "+result);

    }
    
    
}
