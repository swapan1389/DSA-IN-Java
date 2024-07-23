//Write an algorithm to find the max in an array

//Sample Input
//8
//5,10,-1,14,-7,21,-3,1

//Sample Output
//21

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println(max);
        }
    }
    
}
