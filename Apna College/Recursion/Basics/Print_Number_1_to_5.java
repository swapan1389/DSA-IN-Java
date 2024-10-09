public class Print_Number_1_to_5 {
    public static void main(String[] args) {
        int n=1;
        PrintNumber(n);
    }
    public static void PrintNumber(int n){
        if(n==6){
            return;
        }
        System.out.print(n+" ");
        PrintNumber(n+1);
    }
    
}
