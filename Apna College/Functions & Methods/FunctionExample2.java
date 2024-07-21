import java.util.Scanner;

public class FunctionExample2 {
    public static  int ArithmeticOperation(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a=sc.nextInt();
        System.out.println("Enter the second number :");
        int b=sc.nextInt();
       int result= ArithmeticOperation(a,b);
       System.out.println("The result is :"+result);
       sc.close();;
        
    }
    
}
