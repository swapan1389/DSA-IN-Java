// print x^n (where stack height=logn)


public class Power_Calculate_height_Logn {
    public static void main(String[] args) {
        int n = 4;
        int x=2;
        int result= calculatePower(x,n);
        System.out.println("The result is "+result);
    }
    public static int calculatePower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calculatePower(x, n/2)* calculatePower(x, n/2);
        }
        else{
            return x*calculatePower(x, n/2)* calculatePower(x, n/2);    
        }
    }
    
}
