
import java.util.ArrayList;

public class Print_All_Paths_Root_To_Leaf {
    
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

    static void printpath(ArrayList<Integer> path){
        for(int i = 0;i<path.size()-1;i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.print(path.get(path.size()-1));
        System.out.println();

    }
    static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root == null) return;
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printpath(path);
        }
        else{
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
        int values[]={8,5,6,3,1,4,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insertNode(root, values[i]);
        }
        printRoot2Leaf(root, new ArrayList<>());
    }    
}
