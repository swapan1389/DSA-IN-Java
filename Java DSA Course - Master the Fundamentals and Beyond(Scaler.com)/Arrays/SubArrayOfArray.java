//Main Logic
// arr=[1,2,3]
// Subarrays:
// [1]
// [2]
// [3]
// [1,2]
// [2,3]
// [1,2,3]

// si        ei  
// 0          0      [1]
// 0          1      [1,2]
// 0          2      [1,2,3]
// 1          1      [2]
// 1          2      [2,3]
// 2          2      [3]

import java.util.Scanner;

public class SubArrayOfArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int si=0;si<arr.length;si++){
                for(int ei=si;ei<arr.length;ei++){
                    for(int i=si;i<=ei;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    
}
