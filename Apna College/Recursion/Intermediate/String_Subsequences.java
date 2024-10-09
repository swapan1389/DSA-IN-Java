public class String_Subsequences {
    public static void Find_Subsequence(String str,int index,String newStr){

        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(index);
        // current char will be present
        Find_Subsequence(str, index+1, newStr+currChar);

        // current char will not present
        Find_Subsequence(str, index+1, newStr);
    }
    public static void main(String[] args) {
        String str="abc";
        Find_Subsequence(str,0,"");
        
    }
    
}
