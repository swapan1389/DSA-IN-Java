import java.util.Scanner;

public class Problem9 {
    public static int CalculateGCD(int n1,int n2){
        if(n2==0){
            return n1;
        }
        else{
            return CalculateGCD(n2,n1%n2);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("GCD of "+ n1 +" and "+n2+" is "+CalculateGCD(n1, n2));
        sc.close();
        
    }
    
}
