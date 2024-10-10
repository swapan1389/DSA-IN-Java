public class Factorial_Of_A_Number {
    public static int CalculateFactorial(int num){
        if(num==0||num==1){
            return 1;
        }
        return num* CalculateFactorial(num-1);

    }
    public static void main(String[] args) {
        int num=4;
        int result=CalculateFactorial(num);
        System.out.println("The factorial of "+num+" is "+result);
    }
    
}
