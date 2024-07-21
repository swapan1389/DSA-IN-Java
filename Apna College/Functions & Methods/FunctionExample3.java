import java.util.Scanner;

public class FunctionExample3 {
    public static int Factorial(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a*Factorial(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the positive number you want to get factorial value  :");
        int n=sc.nextInt();
        int result=Factorial(n);
        System.out.println("The Factorial of "+n+" is"+"="+" "+result);
        sc.close();

    }
    
}
