/**
 * Print_Number_Using_Recursion
 */
public class Print_Number_Using_Recursion {

    public static void main(String[] args) {
        printNumber(5);
    }
    public static void printNumber(int n){
        if(n>0){
            System.out.print(n+" ");
            printNumber(n-1);
        }
    }
}