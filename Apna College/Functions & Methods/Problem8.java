import java.util.Scanner;

public class Problem8 {
    public static double Power(double x,int n){
        return Math.pow(x, n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x and n");
        double x=sc.nextDouble();
        int n=sc.nextInt();
        System.out.println("The value of x^n is = "+Power(x, n));
        sc.close();
        
    }
    
}
