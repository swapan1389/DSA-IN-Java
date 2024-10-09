import java.util.HashSet;

public class Unique_String_Subsequences {
    public static void Find_Unique_Sequence(String str,int index,String newStr,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar=str.charAt(index);
        Find_Unique_Sequence(str, index+1, newStr+currChar, set);
        Find_Unique_Sequence(str, index+1, newStr, set);
    }

    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        Find_Unique_Sequence(str,0,"",set);
        
    }
    
}
