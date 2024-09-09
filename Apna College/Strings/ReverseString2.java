public class ReverseString2 {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder original=new StringBuilder(str);
        for(int i=0;i<original.length()/2;i++){
            int front=i;
            int back=original.length()-1-i;
            char frontchar=original.charAt(front);
            char backchar=original.charAt(back);
            original.setCharAt(front, backchar);
            original.setCharAt(back, frontchar);
        }
        System.out.println(original);
    }
    
}
