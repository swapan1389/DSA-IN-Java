// Create a function startsWith(String prefix) for a trie.
// Returns true if there is a previously inserted string word that has the prefix
// and false otherwise.

// words[]={"apple","app","mango","man","woman"};
// prefix ="app" output:true
// prefix="moon" output:false





public class StartsWith_Problem {


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



    public static boolean  startsWith(String prefix){
        Node current = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx=prefix.charAt(i)-'a';
            if(current.children[idx]==null){
                return false;
            }

            current=current.children[idx];
        }

        return true;
    }
    public static void main(String[] args) {

        String words[]={"apple","app","mango","man","woman"};
        for(String word:words){
            insert(word);
        }

        String prefix1="app";
        String prefix2="moon";

        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
        System.out.println(startsWith("ma"));


    }
    
}
