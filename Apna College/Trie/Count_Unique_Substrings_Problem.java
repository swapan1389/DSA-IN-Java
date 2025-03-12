// Given a string of length n of lowercase alphabet characters
// we need to count total number of distinct substring of this string
// str="ababa"
// ans=10
// The substrings of a strings will be all prefixes of all suffixes of the string

// Get all suffixes from the string and create a Trie Data Structure from this
// Number of nodes in trie is equal to the number of prefixes


public class Count_Unique_Substrings_Problem {


    static class Node{
        Node[] children;
        boolean isEndOfWord;
        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            isEndOfWord = false;
        }
    }

    static Node root=new Node();

    public static void insert(String word) { // O(L)---> L is the longest string word length
        Node current = root;    
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(current.children[idx]==null){
                current.children[idx] = new Node(); // Add new node
            }

            if(i==word.length()-1){
                current.children[idx].isEndOfWord = true;
            }

            current=current.children[idx];
        }
    }


    public static int CountNodes(Node root){
        if(root==null) return 0;
        int count=1; // Counting the root node
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=CountNodes(root.children[i]); // Recursively count the nodes in the children
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "apple";
        int n = str.length();

        for(int i=0;i<n;i++){
            String suffix=str.substring(i);
            insert(suffix);
        }

        System.out.println("Number of unique substrings"+" "+CountNodes(root));


    }
}