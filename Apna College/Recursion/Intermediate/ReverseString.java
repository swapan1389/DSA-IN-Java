public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        reverse(str,str.length()-1);
    }
    public static void reverse(String str,int index){
        if(index<0) return;
        System.out.print(str.charAt(index));
        reverse(str, index-1);
    }


    
}
