public class TrieCreate {
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


    public static boolean  search(String key){
        Node current = root;
        for (int i = 0; i < key.length(); i++) {
            int idx=key.charAt(i)-'a';
            if(current.children[idx]==null){
                return false;
            }

            if(i==key.length()-1 && current.children[idx].isEndOfWord==false){
                return false;
            }

            current=current.children[idx];
            
        }

        return true;
    }

    public static void main(String[] args) {
        String words[]={"the","a","there","their","any"};
        for(String word:words){
            insert(word);
        }

        System.out.println(search("their")); // true
        System.out.println(search("thor"));    // false
        System.out.println(search("an")); // false
    }
}