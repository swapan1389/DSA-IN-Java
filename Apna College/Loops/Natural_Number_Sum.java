import java.util.Scanner;

public class Natural_Number_Sum {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the natural number you want to sum and get the result");
            int n=sc.nextInt();
            int sum=0;
            for(int i=1;i<=n;i++){
                sum=sum+i;
            }
            System.out.println(sum);
        }
    }
}