
import java.util.Scanner;

// Q..Write an algorithm to find the sum of all the elements in the array


//Input 
//8
//10,3,-1,-8,7,12,3,15


//output
//41
public class SumOfArray {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}