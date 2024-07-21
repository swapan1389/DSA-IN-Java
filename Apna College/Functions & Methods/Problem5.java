import java.util.Scanner;

public class Problem5 {
    public static void ValidateVote(int age){
        if(age>=18){
            System.out.println("You are eligible to vote in India");
        }
        else{
            System.out.println("You are not eligible to vote in India");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        ValidateVote(age);
        sc.close();
    }
    
}
