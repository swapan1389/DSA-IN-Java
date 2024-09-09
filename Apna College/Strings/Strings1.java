import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {
        // String Declaration
        String str1 = "Hello, World ";
        System.out.println(str1);


        //Reading String input from the String
        try (
        Scanner sc = new Scanner(System.in)) {
            String str2 = sc.nextLine();
            System.out.println("Hello "+str2);
        }

        //Concatenation of Strings
        String FirstName = "Swapan";
        String LastName = "Kumar";
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);

        // Length Of The String
        String str3 = "Hello, World";
        System.out.println("Length of the String is: "+str3.length());

        //charAt
        String str4 = "Hello, World";
        for (int i=0;i<str4.length();i++) {
            System.out.println("Character at index "+i+" is: "+str4.charAt(i));
            
        }

        // String equality checking
        String str5 = "Hello";
        String str6 = "Hello";
        System.out.println(str5.equals(str6)); // true

        // String compareTo
        String str7 = "Hello";
        String str8 = "Hello";
        if(str7.compareTo(str8)==0){
            System.out.println("Both Strings are equal");
        }
        else {
            System.out.println("Both Strings are not equal");
        }

        // Substring
        String name="Swapan Kumar Shee";
        String substr=name.substring(0, 8);
        System.out.println(substr);

        


    }
}