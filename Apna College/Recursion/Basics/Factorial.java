import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact =CalculateFactorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
        sc.close();
    }
    public static int CalculateFactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*CalculateFactorial(n-1);
        }
    }
    
}
