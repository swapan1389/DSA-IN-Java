import java.util.Scanner;

public class Problem4 {
    public static double CircleCircumference(double r){
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r=sc.nextDouble();
        System.out.println("The circumference of the circle is :"+CircleCircumference(r));
        sc.close();
        
    }
    
}
