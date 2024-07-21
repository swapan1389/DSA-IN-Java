import java.util.Scanner;

public class if_Else_Example2 {
    public static void main(String[] args) {
        System.out.println("Enter the number to check even or odd");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
        System.out.println("The number is even");
        else
        System.out.println("The number is odd");
        sc.close();
    }
    
}
