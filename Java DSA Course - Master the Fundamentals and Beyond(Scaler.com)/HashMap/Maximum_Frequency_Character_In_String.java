import java.util.HashMap;
import java.util.Map;

public class Maximum_Frequency_Character_In_String {
    public static void main(String[] args) {
        String str = "aabbbcc";
        HashMap<Character,Integer> frq=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            frq.put(ch, frq.getOrDefault(ch,0)+1);
        }

        char maxchar='a';
        int maxfreq=0;
        for(Map.Entry<Character,Integer> entry:frq.entrySet()){
            if(entry.getValue()>maxfreq){
                maxfreq=entry.getValue();
                maxchar=entry.getKey();
            }
        }

        // printing the output
        System.out.println("Maximum frequency character is: "+maxchar);
        System.out.println("Maximum frequency is: "+maxfreq);


    }
    
}
