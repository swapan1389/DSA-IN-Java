import java.util.Scanner;

public class Problem2 {
    public static int SumOfOddNumbers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
            else{
                continue;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number till you want to get the sum of odd numbers : ");
        int a=sc.nextInt();
        System.out.println("The sum of odd numbers till"+" "+ a+" "+"is"+" ="+SumOfOddNumbers(a));
        
        sc.close();
    }
    
}
