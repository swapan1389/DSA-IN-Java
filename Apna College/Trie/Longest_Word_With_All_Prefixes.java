// Longest Word with all Prefixes
// words=["a","banana","app","appl","ap","apply","apple"]
// ans="apple";




public class Longest_Word_With_All_Prefixes {


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


    public static String ans="";

    static void longestword(Node root,StringBuilder temp){

        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].isEndOfWord==true){
                temp.append((char)('a'+i));
                if(ans.length()<temp.length()){
                    ans = temp.toString();
                }
                longestword(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);

            }
        }

    }

    public static void main(String[] args) {
        String words[]={"a","banana","app","appl","ap","apply","apple"};
        for(String word:words){
            insert(word);
        }

        longestword(root, new StringBuilder());
        System.out.println(ans);

    }
}