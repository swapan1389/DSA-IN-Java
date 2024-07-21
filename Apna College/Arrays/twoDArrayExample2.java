import java.util.Scanner;

public class twoDArrayExample2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows :");
            int rows=sc.nextInt();
            System.out.println("Enter the number of columns:");
            int cols=sc.nextInt();
            int[][] arr=new int [rows][cols];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the element to search:  ");
            int x=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(arr[i][j]==x){
                        System.out.println("Element found at = "+(i+" ,"+j));
        
                        break;
                    }
                }
            }
        }
    }
    
}
