
import java.util.Scanner;

public class ArraysExample2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int size=sc.nextInt();
            int [] arr=new int[size];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("The elements of the array are:");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
