public class Print_1_to_N_Using_Recursion {
    public static void printNumber(int n){
        if(n > 0){
            printNumber(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int n=7;
        printNumber(n);
    }
}