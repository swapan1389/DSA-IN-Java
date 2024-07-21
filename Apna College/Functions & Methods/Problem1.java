import java.util.Scanner;

public class Problem1 {
    public static double Average(double a,double b,double c){
        double avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        double a=sc.nextDouble();
        System.out.println("Enter the Second number :");
        double b=sc.nextDouble();
        System.out.println("Enter the third number :");
        double c=sc.nextDouble();
        double avg=Average(a, b, c);
        System.out.println("The average of the three numbers is :"+ avg);
        sc.close();
        
    }
    
}
