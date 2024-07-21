import java.util.Scanner;

public class FunctionExample1 {

    public static void PrintMyName(String name){
        System.out.println("My name is"+" "+name);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        PrintMyName(name);
        sc.close();

        
    }
}