public class vowel_reverse1 {
    public static void main(String[] args) {
        String str = "WELCOMETOSCALER";
        char [] s=str.toCharArray();
        int n=s.length;
        int i=0;
        int j=n-1;
        while (i<j) 
        {
            if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'){
                if(s[j]=='a'||s[j]=='e'||s[j]=='i'||s[j]=='o'||s[j]=='u'||s[j]=='A'||s[j]=='E'||s[j]=='I'||s[j]=='O'||s[j]=='U'){
                    char temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }

            }
            else{
                i++;
            }

            
        }
        String str1="";
        for(int k=0;k<n;k++){
            str1=str1+s[k];
        }
        System.out.println(str1);

        

    }
    
}
