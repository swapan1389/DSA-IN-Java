import java.util.HashSet;

public class First_Repeating_Character_In_String {
    public static void main(String[] args) {

        String str = "abc";
        firstRepeating(str);
    }    
        public static void firstRepeating(String str) {
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<str.length();i++){
                if(set.contains(str.charAt(i))){
                    System.out.println("First Repeating Character is: "+str.charAt(i));
                    return;
                }
                else{
                    set.add(str.charAt(i));
                }
            }
            System.out.println(-1);
        }

        
    }
