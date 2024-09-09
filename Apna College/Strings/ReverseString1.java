public class ReverseString1 {
    public static void main(String[] args) {
        StringBuilder original=new StringBuilder("Hello,World");
        StringBuilder reversed =new StringBuilder();
        for(int i=original.length()-1;i>=0;i--){
            reversed.append(original.charAt(i));
        }
        System.out.println("Original String: "+original);
        System.out.println("Reversed String: "+reversed);


    }
    
}
