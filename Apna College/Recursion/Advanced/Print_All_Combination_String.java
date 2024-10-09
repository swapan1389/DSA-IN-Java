/**
 * Print_All_Combination_String
 */
public class Print_All_Combination_String {
    public static void Find_Combination(String str,String combination,int index){
        if(str.length()==0){
            System.out.println(combination);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            Find_Combination(rem,combination+currChar,index+1);
        }

    }

    public static void main(String[] args) {
        String str="abc";
        Find_Combination(str, "",0);
        
    }
}