
// string can be broken into a space-separated sequence of dictionary words
// words[]={i,like,sam,samsung,mobile,ice}
// key="ilikesamsung"

// output:true


public class Word_Break_Problem {


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

    public static boolean wordBreak(String key){

        if(key.length()==0) return true;

        for(int i=1;i<=key.length();i++){
            String firstPart=key.substring(0,i);
            String secondPart=key.substring(i);

            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String words[]={"i","like","sam","samsung","mobile","ice"};
        for(String word:words){
            insert(word);
        }

        String key1="ilikesamsung";
        String key2="ilikesung";
        System.out.println(wordBreak(key1));
        System.out.println(wordBreak(key2));


        
    }
    
}
