public class CharOccurence {
    public static int first=-1;
    public static int last=-1;
    public static void Find_Occurence(String str,int index,char element){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(index)==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        Find_Occurence(str, index+1, element);
    }
    public static void main(String[] args) {
        
        String str="abvcaaujka";
        Find_Occurence(str, 0, 'a');
    }
    
}
