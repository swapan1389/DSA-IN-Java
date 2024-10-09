import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        System.out.println("Fibonacci Series");
        System.out.print(a+" "+b);
        PrintFibonacci(a,b,n-2);
        sc.close();
    }
    public static void PrintFibonacci(int a,int b,int n){
        if(n>0){
            int next=a+b;
            System.out.print(" "+next);
            PrintFibonacci(b, next, n-1);
        }
        return;
    }
    
}
