
import java.util.Scanner;

//Transpose of a  square matrix

public class TransposeOfSquareMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows...");
            int rows=sc.nextInt();
            System.out.println("Enter the number of columns...");
            int cols=sc.nextInt();
            int[][] arr=new int [rows][cols];
            if(rows!=cols){
                System.out.println("This matrix is not a square matrix..");
            }
            else{
                System.out.println("Enter the elements of the matrix");
                for(int i=0;i<rows;i++){
                    for(int j=0;j<cols;j++){
                        arr[i][j]=sc.nextInt();
                    }
                    System.out.println();
                }
                for(int i=0;i<rows;i++){
                    // for(int j=0;j<cols;j++){
                    //     if(j<i){
                    //         int temp=arr[i][j];
                    //         arr[i][j]=arr[j][i];
                    //         arr[j][i]=temp;
                    //     }
                    // }
                    for(int j=0;j<i;j++){
                        int temp=arr[i][j];
                        arr[i][j]=arr[j][i];
                        arr[j][i]=temp;
                    }
                }
                System.out.println("Transpose of the matrix is...");
                for(int i=0;i<rows;i++){
                    for(int j=0;j<cols;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }

            }
        }
    }
    
}
