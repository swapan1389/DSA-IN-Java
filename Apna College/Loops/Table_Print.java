
import java.util.Scanner;

public class Table_Print {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number you want to print table");
            int n=sc.nextInt();
            for(int i=1;i<=10;i++){

                System.out.println(n+"X"+i+""+"="+n*i);
            }
        }
    }
    
}
