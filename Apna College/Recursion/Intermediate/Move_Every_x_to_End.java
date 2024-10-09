public class Move_Every_x_to_End {
    public static void MoveAll_X(String str,int index,int count,String newStr){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(index);
        if(currChar=='x'){
            count++;
            MoveAll_X(str, index+1, count, newStr);
        }
        else{
            newStr+=currChar;
            MoveAll_X(str, index+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        MoveAll_X(str, 0, 0, "");
        
    }
    
}
