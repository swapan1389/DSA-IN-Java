public class RemoveDuplicate {
    public static boolean[] map=new boolean[26];
    public static void Find_Duplicate_Remove(String str,int index,String newStr){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(index);
        if(map[currChar-'a']){
            Find_Duplicate_Remove(str, index+1, newStr);
        }
        else{
            newStr+=currChar;
            map[currChar-'a']=true;
            Find_Duplicate_Remove(str, index+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str="aabbcc";
        Find_Duplicate_Remove(str, 0, "");
        
    }
    
}
