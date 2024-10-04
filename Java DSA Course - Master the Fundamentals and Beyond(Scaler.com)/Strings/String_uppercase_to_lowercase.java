public class String_uppercase_to_lowercase {
    public static void main(String[] args) {
        String str = "Swapan";
        char [] st=str.toCharArray();
        for(int i=0;i<st.length;i++){
            if(st[i]>='A' && st[i]<='Z'){
                st[i]=(char)(st[i]+32);
            }

        }
        System.out.println("Original String is  : "+str);
        String s="";
        for (char c : st) {
            s=s+c;
        }
        System.out.println("Converted string  :"+s);

    }
    
}
