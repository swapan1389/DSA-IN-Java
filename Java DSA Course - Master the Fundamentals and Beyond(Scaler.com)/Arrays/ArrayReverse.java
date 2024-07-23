//Write an algorithm to reverse the array

//Sample Input
//8
//5,10,-1,14,-7,21,-3,1

//Sample Output
//1,-3,21,-7,14,-1,10,5

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int i=0;
            int j=n-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            System.out.println("The reversed array is :");
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
        
        }
        
    }
    
}
