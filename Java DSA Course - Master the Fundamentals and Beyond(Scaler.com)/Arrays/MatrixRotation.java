import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows...");
            int rows = sc.nextInt();
            System.out.println("Enter the number of columns...");
            int cols = sc.nextInt();
            int[][] arr = new int[rows][cols];
            
            if (rows != cols) {
                System.out.println("This matrix is not a square matrix.");
            } else {
                System.out.println("Enter the elements of the matrix");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        arr[i][j] = sc.nextInt();
                    }
                }
                
                System.out.println("Original Matrix:");
                printMatrix(arr);
                
            }
            Rotation(arr);
        }
    }

public static void Rotation(int[][] arr) {
        if (arr.length != arr[0].length) {
            System.out.println("This matrix is not a square matrix.");
            return;
        }

        // Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse each row
        for (int[] row : arr) {
            int i = 0;
            int j = row.length - 1;
            while (i < j) {
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println("Rotated Matrix:");
        printMatrix(arr);
}

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}