public class RemoveVowel1 {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder original=new StringBuilder(str);
        //StringBuilder remove_vowel=new StringBuilder();
        String str1="";
        for(int i=0;i<original.length();i++){
            char ch=original.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A' || ch=='E'|| ch=='I'||ch=='O'||ch=='U'){
                continue;

            }
            else{
               // remove_vowel.append(ch);
               str1=str1+ch;
            }
        }
        System.out.println("Original String is  :"+original);
        //System.out.println("String after vowel removal is :"+remove_vowel);
        System.out.println("String after vowel removal is :"+str1);

    }

    
}